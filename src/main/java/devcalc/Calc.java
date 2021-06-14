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
        System.out.println("(1) Multiplicar");
        System.out.println("(1) Dividir");
        System.out.println("Escolha o Calculo Desejado");

        String opcao = entrada.nextLine();

        System.out.println("Passou pelo método de somarDoisNumeros");
        somarDoisNumeros();

    }
    public static void somarDoisNumeros(){

    }



}