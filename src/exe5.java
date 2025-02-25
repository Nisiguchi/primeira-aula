
import java.util.Scanner;

public class exe5 {
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        double salarioAtual, desejado, perAumento, aumento;

        System.out.println("Digite seu salário atual: ");
        salarioAtual = leia.nextDouble();

        System.out.println("Digite o percentual desejado para aumento de salário: ");
        perAumento = leia.nextDouble();

        desejado = salarioAtual * perAumento/100;
        aumento = desejado + salarioAtual;

        System.out.println("O valor de aumento desejado é: " + desejado + 
        "O valor do novo salário é:" + aumento);

    }
}
