package atividadeDois;

import java.util.Scanner;

public class exe1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n1, n2 ;

        System.out.println("Digite um valor: ");
        n1 = entrada.nextInt();

        System.out.println("Entre com outro número: ");
        n2 = entrada.nextInt();

        if (n1 > n2) {
            System.out.println("O número maior é: " + n1);    
        } else {
            System.out.println("O número maior é: " + n2);
        }
    }
}
