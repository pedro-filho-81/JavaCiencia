package sessao1_2;

import java.util.Scanner; // for data entry
/*
 * 1.2.15 Escreva um programa que receba três números 
 * inteiros positivos como argumentos de linha de 
 * comando e imprima falso se qualquer um deles for 
 * maior ou igual à soma dos outros dois e verdadeiro 
 * caso contrário. (Nota: Este cálculo testa se os 
 * três números poderiam ser os comprimentos dos 
 * lados de algum triângulo.)
 */

public class Exe15 {
   public static void main(String[] args) {

      // the new keyword creates the input object
      Scanner input = new Scanner(System.in);

      // data input
      System.out.println("Digite um inteiro: ");
      // n1 variable receives value from the user
      int n1 = input.nextInt();
      System.out.println("Segundo inteiro: ");
      int n2 = input.nextInt();
      System.out.println("Terceiro inteiro: ");
      int n3 = input.nextInt();

      // display
      System.out.println("n1 = " + n1);
   }
}
