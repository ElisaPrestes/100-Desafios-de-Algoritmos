/*4) Desenvolva um algoritmo que leia dois números inteiros e mostre o somatório
        entre eles.
        Ex:
        Digite um valor: 8
        Digite outro valor: 5
        A soma entre 8 e 5 é igual a 13.
*/

package org.example.passo01;
import java.util.Scanner;

public class Ex04_SumOfTwo {
    public static void main (String[] args){
        Scanner myObj = new Scanner(System.in);


        System.out.print("Vamos somar dois números!\nDigite o 1° número: ");
        int n1 = myObj.nextInt();

        System.out.print("Digite o 2° número: ");
        int n2 = myObj.nextInt();

        int soma = n1+n2;

        System.out.printf("A soma de %d + %d é: %d.%n", n1, n2, soma);

        myObj.close();
    }
}
