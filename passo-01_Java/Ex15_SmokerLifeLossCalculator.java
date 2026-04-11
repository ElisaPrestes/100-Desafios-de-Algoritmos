/*[DESAFIO] Escreva um programa para calcular a redução do tempo de vida de um fumante. Pergunte a quantidade de cigarros fumados por dia e quantos anos ele já fumou. Considere que um fumante perde 10 min de vida a cada cigarro. Calcule quantos dias de vida um fumante perderá e exiba o total em dias.
 */
import java.util.Scanner;
public class Ex15_SmokerWastedLifetime
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("====== Calculadora de perda de vida ======\nDigite a quantidade aproximada de cigarros que você fuma por dia: ");
        int cigarros = sc.nextInt();

        System.out.print("Digite a quantos anos você fuma: ");
        int anos = sc.nextInt();

        //converte anos em dias
        int diasfumando = anos*365;
        //calcula cigarros fumados em dias
        int cigarrostotal = cigarros*diasfumando;
        //calcula minutos perdidos
        int minutosperdidos = cigarrostotal*10;
        //converte minutos em horas
        double minutoporhora=60.00;
        double horasperdidas = minutosperdidos/minutoporhora;
        //converte horas em dias
        double diasperdidos = horasperdidas/24;
        System.out.println("Dias fumando: "+diasfumando);
        System.out.println("Fumou um total de "+cigarrostotal+" cigarros");
        System.out.printf("Perdeu %.2f dias de vida.",diasperdidos);

        sc.close();
    }
}
