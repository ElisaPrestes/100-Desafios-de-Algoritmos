/*3) Crie um programa que leia o nome e o salário de um funcionário, mostrando no
* final uma mensagem.
* Ex:
* Nome do Funcionário: Maria do Carmo
* Salário: 1850,45
* O funcionário Maria do Carmo tem um salário de R$1850,45 em Junho.
*/

package org.example.passo01;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class Ex03_EmployeeInfo {
    public static void main (String[] args){
        Scanner myObj = new Scanner(System.in);

        System.out.print("Digite o nome do(a) funcionário(a): ");
        String empName = myObj.nextLine();

        System.out.print("Digite o salário do(a) funcionário(a): ");
        double empSalary = myObj.nextDouble();

        // .getMonth() pega apenas o mês
        String currentMonth = LocalDate.now()
                .getMonth()
                .getDisplayName(TextStyle.FULL, Locale.of("pt", "BR"));
                // FULL = "março" (nome inteiro) (SHORT) = "mar" (nome curto).

        //usa-se format string com printf, como no Python, mas as variáveis vêm depois
        //%s  -> indica string  %.2f -> indica que usaremos 2 casas decimais
        System.out.printf("%s tem um salário de R$%.2f em %s.", empName, empSalary, currentMonth);

        myObj.close();
    }
}
