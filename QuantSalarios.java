//5. Crie um algoritmo que receba via construtor o valor do salário mínimo e o valor do salário de um usuário, calcule a quantidade de salários mínimos esse usuário ganha e imprima o resultado.
//(1SM=R$1320,00)

import java.util.Scanner;

public class QuantSalarios {
    public static void main(String[] args){
        int SalarioMin;
        int SalarioUser;
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual o Salário Mínimo? ");
        SalarioMin = scan.nextInt();

        System.out.println("Qual o Salário do Usuário? ");
        SalarioUser = scan.nextInt();

        int quantsal = (SalarioUser / SalarioMin);
        System.out.println("A quantidade de salários mínimos é de " + quantsal);
    }
}
