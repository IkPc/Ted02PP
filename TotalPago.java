//4. Escrever um algoritmo que receba via construtor:
//- a porcentagem do IPI a ser acrescido no valor das peças
//- o código da peça 1, valor unitário da peça 1, quantidade de peças 1
//- o código da peça 2, valor unitário da peça 2, quantidade de peças 2
//O algoritmo deve calcular o valor total a ser pago e apresentar o resultado.
//Fórmula : (valor1*quant1 + valor2*quant2)*(IPI/100 + 1)

import java.util.Scanner;

public class TotalPago {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a porcentagem: ");
        double IPI = sc.nextDouble();

        System.out.println("Digite o codigo 1: ");
        double peca1 = sc.nextDouble();

        System.out.println("Digite o valor 1: ");
        double valor1 = sc.nextDouble();

        System.out.println("Digite a quantidade 1: ");
        double quant1 = sc.nextDouble();

        System.out.println("Digite o codigo 2: ");
        double peca2 = sc.nextDouble();

        System.out.println("Digite o valor 2: ");
        double valor2 = sc.nextDouble();

        System.out.println("Digite a quantidade 2: ");
        double quant2 = sc.nextDouble();

        double resultado = (valor1*quant1 + valor2*quant2)*(IPI/100 + 1);
        System.out.println(resultado);

    }
}
