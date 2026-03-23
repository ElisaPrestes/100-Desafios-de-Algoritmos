/*13) Faça um algoritmo que leia o salário de um funcionário, calcule e mostre o
seu novo salário, com 15% de aumento.
*/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


        System.out.print("Digite o salário atual do funcionário: ");
        double salario = sc.nextDouble();
        
        salario *= 1.15;

        System.out.printf("O valor com 15%% de aumento é: R$%.2f", salario);

        sc.close();
	}
}