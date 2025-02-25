
import java.util.Scanner;

public class exe7 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        double base, gratificacao, total, imposto, fim;

        System.out.println("Digite seu salário atual: ");
        base = leia.nextDouble();

        gratificacao = 50.0;
        imposto = base * 10/100;
        total = base - imposto;
        fim = total + gratificacao;

        System.out.println("Sua gratificação é: " + gratificacao + 
        " , o imposto que você paga é: " + imposto +
        " , o seu salário final é: " + fim);

    }
}
