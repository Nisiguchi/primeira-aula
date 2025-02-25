package atividadeum;
import java.util.Scanner;

public class exe8 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        double deposito, juros, rendimento, total; 

        System.out.print("Digite o valor do depósito: ");
        deposito = leia.nextDouble();

        System.out.print("Digite a taxa de juros: ");
        juros = leia.nextDouble();

        rendimento = deposito * (juros / 100);
        total = deposito + rendimento;

        System.out.printf("Valor do rendimento é: " + rendimento + 
        " , o valor total após o rendimento: " + total);

    }
}
