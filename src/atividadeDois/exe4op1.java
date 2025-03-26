package atividadeDois;

import java.util.Scanner;

public class exe4op1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int salario, codigo, aumento, diferenca;

        System.out.println("Digite o código do seu cargo atual: ");
        System.out.println("101 - gerente");
        System.out.println("102 - engenheiro");
        System.out.println("103 - técnico");
        System.out.println("Indefinido - outro cargo");
        codigo = entrada.nextInt();


        switch (codigo) {
            case 101: {
                System.out.println("Digite seu salário atual: ");
                salario = entrada.nextInt();

                aumento = salario + (salario*10/100);
                diferenca = aumento - salario;

                System.out.println("Seu salário era: " + salario + 
                " Seu novo salário é: " + aumento + 
                " A diferença adicionada foi: " + diferenca);
            }
            case 102: {
                System.out.println("Digite seu salário atual: ");
                salario = entrada.nextInt();

                aumento = salario + (salario*20/100);
                diferenca = aumento - salario;

                System.out.println("Seu salário era: " + salario + 
                " Seu novo salário é: " + aumento + 
                " A diferença adicionada foi: " + diferenca);
            }
            case 103: {
                System.out.println("Digite seu salário atual: ");
                salario = entrada.nextInt();

                aumento = salario + (salario*30/100);
                diferenca = aumento - salario;

                System.out.println("Seu salário era: " + salario + 
                " Seu novo salário é: " + aumento + 
                " A diferença adicionada foi: " + diferenca);
            }
            default: System.out.println("Digite seu salário atual: ");
            salario = entrada.nextInt();

            aumento = salario + (salario*40/100);
            diferenca = aumento - salario;

            System.out.println("Seu salário era: " + salario + 
            " Seu novo salário é: " + aumento + 
            " A diferença adicionada foi: " + diferenca);
        }
    entrada.close();
    }    
}
