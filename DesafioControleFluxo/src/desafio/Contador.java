package desafio;

import java.util.Scanner;


public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite um valor inteiro como primeiro parâmetro");

        int paramOne = terminal.nextInt();
        System.out.println("Digite outro valor inteiro como segundo parâmetro");
        int paramTwo = terminal.nextInt();

        try{
            contar(paramOne, paramTwo);
        } catch (ParametrosInvalidosException e){
            e.getMessage();
        }

    }

    static void contar(int paramOne, int paramTwo) throws ParametrosInvalidosException {
        int contagem = paramTwo - paramOne;
        if (paramOne > paramTwo){
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }
        System.out.println("Intervalo de valores resultante dos parâmetros inseridos");
        System.out.println("---------------------------------------------------------");
        for (int i = 1; i <= contagem; i++){
            System.out.print(i + ", ");
        }
        System.out.println("");
        System.out.println("---------------------------------------------------------");
    }


}
