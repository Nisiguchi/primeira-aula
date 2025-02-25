package atividadeUm;

import java.util.Scanner;

public class exe4 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        double salario, aumento, salarioNovo;

        System.out.println("Digite seu salário atual:");
        salario = leia.nextDouble();

        aumento = salario * 0.25;
        salarioNovo = salario + aumento;
        //poderia ser aumento = salario + (salario *25/100)

        System.out.println("Seu novo salário é: " + salarioNovo);

    }
}
