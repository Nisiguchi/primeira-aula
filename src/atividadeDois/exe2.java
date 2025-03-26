package atividadeDois;

import java.util.Scanner;

public class exe2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salario, bonusUm, bonusDois;

        System.out.println("Digite seu salário: ");
        salario = entrada.nextDouble();

        bonusUm = salario + 100.0;
        bonusDois = salario + 50.0;

        if (salario >= 1000.0) {
            System.out.println("Você recebeu um bônus! Seu salário ficou: " + bonusUm);
        } else {
            System.out.println("Você recebeu um bônus! Seu salário ficou: " + bonusDois);
        }

        entrada.close();
    }
} 
