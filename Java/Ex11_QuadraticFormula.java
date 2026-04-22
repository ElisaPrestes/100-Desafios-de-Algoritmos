/*11) Desenvolva uma lógica que leia os valores de A, B e C de uma equação do
segundo grau e mostre o valor de Delta.
*/
import java.util.Scanner;

public class Ex11_QuadraticFormula
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


        System.out.print("Digite o valor de A: ");
        int a = sc.nextInt();
        System.out.print("Digite o valor de B: ");
        int b = sc.nextInt();
        System.out.print("Digite o valor de C: ");
        int c = sc.nextInt();

        int delta = (b*b)-4*a*c;


        System.out.printf("O valor de Delta é: "+ delta);

        sc.close();
	}
}