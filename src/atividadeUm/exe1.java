package atividadeum;
import java.util.Scanner;

public class exe1 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int num1, num2, num3, num4, soma;

        System.out.println("Digite um número: ");
        num1 = leia.nextInt();

        System.out.println("Digite o próximo número: ");
        num2 = leia.nextInt();

        System.out.println("Digite o próximo número: ");
        num3 = leia.nextInt();

        System.out.println("Digite o próximo número: ");
        num4 = leia.nextInt();

        soma = num1 + num2 + num3 + num4;

        System.out.println("A soma dos números é: " + soma);
    }
}
