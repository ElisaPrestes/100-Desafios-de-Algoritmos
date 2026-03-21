/*2) Faça um programa que leia o nome de uma pessoa e mostre uma mensagem de boasvindas para ela:
Ex:
Qual é o seu nome? João da Silva
Olá João da Silva, é um prazer te conhecer!
*/

package org.example.passo01;
import java.util.Scanner;

public class Ex02_WelcomeBruna {
    public static void main (String[] args){
        Scanner myObj = new Scanner(System.in);

        System.out.print("Qual seu nome? ");
        String userName = myObj.nextLine();

        System.out.println("Olá, "+userName+"!\nSeja bem vindo(a) ao meu repositório :)");
    }
}
