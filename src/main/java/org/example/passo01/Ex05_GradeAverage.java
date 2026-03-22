/*5) Faça um programa que leia as duas notas de um aluno em uma matéria e mostre
na tela a sua média na disciplina.
        Ex:
Nota 1: 4.5
Nota 2: 8.5
A média entre 4.5 e 8.5 é igual a 6.5
*/

package org.example.passo01;
import java.util.Scanner;

public class Ex05_GradeAverage {
    public static void main (String[] args){
        Scanner myObj = new Scanner(System.in);

        System.out.print("Vamos calcular sua média!\nDigite a 1ª nota: ");
        double n1 = myObj.nextDouble();

        System.out.print("Digite a 2ª nota: ");
        double n2 = myObj.nextDouble();

        double media = (n1+n2)/2;

        System.out.printf("A média das notas %.2f + %.2f é: %.2f%n", n1, n2, media);

        myObj.close();
    }

}
