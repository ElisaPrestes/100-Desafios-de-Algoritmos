/*12) Crie um programa que leia o preço de um produto, calcule e mostre o seu
PREÇO PROMOCIONAL, com 5% de desconto.
*/
import java.util.Scanner;

public class Ex12_Discount
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


        System.out.print("Digite o valor do produto: ");
        double prod = sc.nextDouble();
        
        double disc = prod*0.05;
        double value = prod-disc;

        System.out.printf("O valor do produto é: R$%.2f%nO valor com desconto de R$%.2f (5%%) é: R$%.2f", prod, disc, value);

        sc.close();
	}
}