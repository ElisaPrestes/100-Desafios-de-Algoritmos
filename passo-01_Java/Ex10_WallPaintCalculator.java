/*
10) Faça um algoritmo que leia a largura e altura de uma parede, calcule e
mostre a área a ser pintada e a quantidade de tinta necessária para o serviço,
sabendo que cada litro de tinta pinta uma área de 2metros quadrados.
 */
package org.example.passo01;
import java.util.Scanner;

public class Ex10_WallPaintCalculator {
    void main(){

        System.out.print("Insira a largura da sua parede: ");
        Scanner sc = new Scanner(System.in);
        double width = sc.nextDouble();

        System.out.print("Insira a altura da sua parede: ");
        double height = sc.nextDouble();

        double area = width*height;

        //arredondando para cima
        int paint = (int) Math.ceil(area / 2);
        String roundMessage = "";

        if (area % 2 != 0) {
            roundMessage = " (arredondado para cima)";
        }

        System.out.printf("Sua parede possui %.2fm² de área. Compre %d baldes de tinta%s", area, paint, roundMessage);

    }
}
