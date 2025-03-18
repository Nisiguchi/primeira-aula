package atividadeDois;

import java.util.Scanner;

public class exemplo1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int opcao;

        System.out.println("Escolha uma das opções: ");
        System.out.println("1 - Calcular média");
        System.out.println("2- Calcular salário");
        System.out.println("3- Calcular idade");
        opcao = entrada.nextInt();

        switch (opcao) {
            case 1 :
                double nota1 ,nota2 ,nota3, media;
                System.out.println("Digite a nota 1: ");
                nota1 = entrada.nextDouble();
                System.out.println("Digite a segunda nota: ");
                nota2 = entrada.nextDouble();
                media = (nota1+nota2)/2;
                System.out.println("A média é: " + media);
                break;
            
            case 2:
                double salario, salarioLiquido;
                System.out.println("Digite o salário: ");
                salario = entrada.nextDouble();
                if (salario > 2000) {
                    salarioLiquido = salario - (salario * 15 /100);
                } else {
                    salarioLiquido = salario - (salario * 10 /100);
                }
                System.out.println("Salario liquido é: " + salarioLiquido);
        }
    }
}
