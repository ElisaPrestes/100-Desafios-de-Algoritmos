/*
8) Desenvolva um programa que leia uma distância em metros e mostre os valores
relativos em outras medidas.
Ex:
Digite uma distância em metros: 185.72
A distância de 85.7m corresponde a:
0.18572Km
1.8572Hm
18.572Dam
1857.2dm
18572.0cm
185720.0mm
 */
package org.example.passo01;

import java.util.Scanner;

public class Ex08_DistanceConverter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma distância em metros: ");
        double m = sc.nextDouble();

        System.out.println("\nA distância de " + m + "m corresponde a:");
        System.out.printf("%.5fKm%n",  m / 1000);
        System.out.printf("%.4fHm%n",  m / 100);
        System.out.printf("%.3fDam%n", m / 10);
        System.out.printf("%.1fdm%n",  m * 10);
        System.out.printf("%.1fcm%n",  m * 100);
        System.out.printf("%.1fmm%n",  m * 1000);

        sc.close();
    }
}