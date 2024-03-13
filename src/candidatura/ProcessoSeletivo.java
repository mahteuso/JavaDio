import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        List<String> candidatosAprovados = selecaoCandidatos();
        ligarCandidatosAprovados(candidatosAprovados);
    }

    static void ligarCandidatosAprovados(List<String> candidatosAprovados) {
        int tentativas = numeroLigacoes();
        for (String candidato : candidatosAprovados) {

            if (tentativas < 4) {
                System.out.println("Conseguimos contato com " + candidato + " após " + tentativas + " tentativas.");
                tentativas = numeroLigacoes();
            } else {
                System.out.println("Não conseguimos contato com o candidato: "+ candidato);
                tentativas = numeroLigacoes();
            }
        }
    }

    static int numeroLigacoes() {
        int tentativas = (int) (Math.random() * 8);
        while (tentativas == 0) {
            tentativas = (int) (Math.random() * 8);
        }
        return tentativas;
    }

    static List<String> selecaoCandidatos() {
        String[] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto", "Fabiano", "Priscila", "Fernando", "Ronaldo", "Wanda"};
        List<String> candidatosAprovados = new ArrayList<>();
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        int candidatosRejeitados = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();
            System.out.println("  ");
            System.out.println("O candidato: " + candidatos[candidatoAtual] + " Solicitou um salário com valor de R$" + salarioPretendido);
            if (salarioPretendido <= salarioBase) {
                System.out.println("O(a)S candidato: " + candidatos[candidatoAtual] + " foi selecionado");
                candidatosSelecionados++;
                candidatosAprovados.add(candidatos[candidatoAtual]);
            } else {
                System.out.println("AGUARDAR RESULTADO DOS DEMAIS CANDIDATOS");
                candidatosRejeitados++;
            }
            candidatoAtual++;
        }
        System.out.println("------------------------------------------------------------");
        System.out.println(candidatosRejeitados + " candidatos foram rejeitados no processo");
        System.out.println("------------------------------------------------------------");
        System.out.println(candidatosSelecionados + " candidatos foram selecionados");
        for (String candidato : candidatosAprovados) {
            System.out.println(candidato);
        }
        System.out.println("------------------------------------------------------------");
        return candidatosAprovados;
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase < salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRAPROPOSTA");
        } else {
            System.out.println("AGUARDAR RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
}
