/*7) Crie um algoritmo que leia um número real e mostre na tela o seu dobro e a
sua terça parte.
Ex:
Digite um número: 3,5
O dobro de 3,5 é 7,0
A terça parte de 3,5 é 1,16666
 */

package org.example.passo01;
import java.util.Scanner;

public class DoubleThirdPart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número racional: ");
        double number = scanner.nextDouble();

        double doubled  = number*2;
        double thirdPart = number/3;
        System.out.printf("O dobro de %.2f é: %.2f%nA terça parte de %.2f é: %.2f",number, doubled , number, thirdPart);

        scanner.close();
    }
}
