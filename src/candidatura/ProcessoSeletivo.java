import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        selecaoCandidatos();
    }


    static void selecaoCandidatos(){
        String[] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto", "Fabiano", "Priscila", "Fernando", "Ronaldo", "Wanda"};
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        int candidatosRejeitados = 0;
        double salarioBase = 2000.0;
        while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();
            if (salarioPretendido <= salarioBase){
                System.out.println("O candidato: " + candidatos[candidatoAtual] + " foi selecionado");
                candidatosSelecionados++;
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
        System.out.println("------------------------------------------------------------");
    }
    static double valorPretendido(){
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
