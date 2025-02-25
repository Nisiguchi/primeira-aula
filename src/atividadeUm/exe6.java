package atividadeum;

import java.util.Scanner;

public class exe6 {
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        double base, gratificacao, total, imposto, fim;

        System.out.println("Digite seu salário atual: ");
        base = leia.nextDouble();

        gratificacao = base *5/100;
        total = base + gratificacao;
        imposto = total * 7/100;
        fim = total - imposto;


        System.out.println("Sua gratificação é: " + gratificacao + 
        " , o que você recebe é: " + total + 
        " , o imposto que você paga é: " + imposto +
        " , o seu salário final é: " + fim);

    }
}
