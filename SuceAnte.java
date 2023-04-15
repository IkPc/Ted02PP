//6. Desenvolva um algoritmo em Java que receba via construtor um número inteiro e imprima o seu antecessor e seu sucessor.

import java.util.Scanner;

    public class SuceAnte {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Digite o número: ");
            int numInt = sc.nextInt();

            int antecessor = numInt - 1;
            int sucessor = numInt + 1;

            System.out.println("Antecessor: " + antecessor);
            System.out.println("Sucessor: " + sucessor);

        }
    }
