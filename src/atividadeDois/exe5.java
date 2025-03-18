package atividadeDois;

import java.util.Scanner;

public class exe5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero, triplo;
        int contar = 0;

        while(contar <= 9) {
        System.out.println("Digite 10 números e irei te mostrar o triplo dele: ");
        numero = entrada.nextInt();
        triplo = numero * 3;

        System.out.println("O triplo é: " + triplo);
        contar++;

        }
    }
}
