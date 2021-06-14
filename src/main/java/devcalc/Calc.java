// 1-Pacote
package devcalc;
// 2 - Bibliotecas

import java.util.Scanner;

// 3 - Classe
public class Calc {
    // 3.1 - Atributos
    static Scanner entrada = new Scanner(System.in); // entrada = input

    // 3.2 - Métodos e funções
    public static void main(String[] args) {
        System.out.println(">>> CALCULADORA <<<");
        System.out.println("(1) Somar");
        System.out.println("(2) Subtrair");
        System.out.println("(3) Multiplicar");
        System.out.println("(4) Dividir");
        System.out.println("Escolha o Calculo Desejado");

        String opcao = entrada.nextLine();


        System.out.println("Entre o 1º numero: ");
        int num1 = entrada.nextInt();
        System.out.println("Entre o 2º numero: ");
        int num2 = entrada.nextInt();

        // Chama a função do calculo desejado
        switch (opcao){
            case "1":
                somarDoisNumeros();
                break;

            default:
                System.out.println("Opcao invalida");
                break;
        }

        System.out.println("Passou pelo método main");

    }

    public static void somarDoisNumeros(int num1, int num2){

        System.out.println("Passou pelo método somarDoisNumeros");
    }



}