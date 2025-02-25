package atividadeum;
import java.util.Scanner;

public class exe3 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        double n1, n2, n3, media;

        System.out.println("Digite um número: ");
        n1 = leia.nextDouble();

        System.out.println("Digite um número: ");
        n2 = leia.nextDouble();

        System.out.println("Digite um número: ");
        n3 = leia.nextDouble();

        media = (n1 * 1 + n2 * 2 + n3 * 2)/5;

        System.out.println("O resultado da média ponderada é: " + media);
    }
}

