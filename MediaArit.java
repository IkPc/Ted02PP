import java.util.Scanner;

public class MediaArit {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int n1 = ler.nextInt();

        System.out.print("Digite o segundo número: ");
        int n2 = ler.nextInt();

        System.out.print("Digite o terceiro número: ");
        int n3 = ler.nextInt();

        int primeira_media = (n1 + n2 + n3) / 3;
        System.out.println();

        System.out.print(">>> A primeira média é: " + primeira_media);
        System.out.println("\n");

        System.out.print("Digite o quarto número: ");
        int n4 = ler.nextInt();

        System.out.print("Digite o quinto número: ");
        int n5 = ler.nextInt();

        System.out.print("Digite o sexto número: ");
        int n6 = ler.nextInt();

        int segunda_media = (n4 + n5 + n6) / 3;
        System.out.println();

        System.out.println(">>> A segunda média é: " + segunda_media);
        int soma = primeira_media + segunda_media;

        System.out.println(">>> A soma das médias é: " + soma);
        double resultado = (double)soma / 2.0D;

        System.out.println(">>> A média das médias é: " + resultado);
    }
}
