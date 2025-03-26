package atividadeDois;

import java.util.Scanner;

public class exe6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero, contar;

        System.out.println("Digite 12 números: ");
        numero = entrada.nextInt();

        for(contar = 0; contar<=11;) {
        contar++;
        System.out.println("A soma dos números é: " + numero);

        }

    }
}
