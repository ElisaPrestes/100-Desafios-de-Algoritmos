/*6) Faça um programa que leia um número inteiro e mostre o seu antecessor e seu
sucessor.
        Ex:
Digite um número: 9
O antecessor de 9 é 8
O sucessor de 9 é 10
*/

package org.example.passo01;
import java.util.Scanner;

public class Ex06_PredecessorSuccessor {
    public static void main (String[] args){
        Scanner myObj= new Scanner (System.in);

        System.out.print("Digite um número: ");
        int number = myObj.nextInt();

        int prede = number-1;
        int succe = number+1;

        System.out.printf("O antecessor de %d é %d%nO sucessor de %d é %d.", number, prede, number, succe);
        myObj.close();
    }
}
