//1. Faça um algoritmo que receba via constutor a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa em dias.
//Obs.: Leve em consideração o ano com 365 dias e o mês com 30
//(Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)

import java.util.Scanner;

public class IdadeAnoMesDia {
    public static void main(String[] args){
        final short DIAS_NO_ANO = 365;
        final short DIAS_NO_MES = 30;
        short anos;
        short meses;
        short dias;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe a idade.");

        System.out.print("Anos: ");
        anos = leitor.nextShort();

        System.out.print("Meses: ");
        meses = leitor.nextShort();

        System.out.print("Dias: ");
        dias = leitor.nextShort();

        dias += (anos * DIAS_NO_ANO) + (meses * DIAS_NO_MES);

        System.out.println("\n\nA sua idade é equivalente a " + dias + " dias");
    }
}
