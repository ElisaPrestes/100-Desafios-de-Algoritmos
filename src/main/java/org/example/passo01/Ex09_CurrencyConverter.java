/*
9) Faça um algoritmo que leia quanto dinheiro uma pessoa tem na carteira (em R$)
e mostre quantos dólares ela pode comprar. Considere US$1,00 = R$3,45.
 */

import java.util.Scanner;

void main() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Olá! Bem-vindo(a)!\n 1 dólar = R$5,31\nDigite quantos R$ tem em sua carteira: ");
    double reais = sc.nextDouble();

    double buy = reais / 5.31;
    double taxa = buy * 0.01;
    double value = buy - taxa;

    System.out.printf(
            "R$%.2f → U$%.2f%n(taxa de 1%% = $%.2f)%nVocê leva: %.2f dólares",
            reais, buy, taxa, value);
    sc.close();

}