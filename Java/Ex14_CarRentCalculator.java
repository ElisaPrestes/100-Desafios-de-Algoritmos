/*14) A locadora de carros precisa da sua ajuda para cobrar seus serviços. Escreva
um programa que pergunte a quantidade de Km percorridos por um carro alugado e a
quantidade de dias pelos quais ele foi alugado. Calcule o preço total a pagar,
sabendo que o carro custa R$90 por dia e R$0,20 por Km rodado.
import java.util.Scanner;
*/
public class Main
{
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

        System.out.print("====== Calculadora de gastos ======\nDigite a quantidade de dias: ");
        int dias = scanner.nextInt();
        
        System.out.print("Digite a quantidade de Km: ");
        double km = scanner.nextDouble();
        
        double valorpagar = (dias*90)+(km*0.20);
        
        System.out.printf("O valor calculado a pagar: R$%.2f",valorpagar);

        sc.close();
	}
}