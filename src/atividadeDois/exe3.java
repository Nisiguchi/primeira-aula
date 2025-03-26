package atividadeDois;

import java.util.Scanner;

public class exe3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcao, n1 , n2, multi, divisao, media, diferenca;

        System.out.println("Digite um número: ");
        n1 = entrada.nextInt();

        System.out.println("Entre com outro número");
        n2 = entrada.nextInt();

        System.out.println("Escolha uma das opções para executar:");
        System.out.println("'1' - Média entre os números digitados");
        System.out.println("'2' - Multiplicação entre os números digitados");
        System.out.println("'3' - Divisão do primeiro pelo segundo");
        System.out.println("'4' - Diferença do maior pelo menor");
        opcao = entrada.nextInt();

        media = (n1 + n2)/2;
        multi = n1 * n2;
        divisao = n1 / n2 ;

        switch (opcao) {

            case 1 :System.out.println("A média entre os números digitados é: "+ media); break;
            case 2 :System.out.println(" A multiplicação entre os números digitados é: " + multi); break;
            case 3 :System.out.println(" A divisão do primeiro pelo segundo é: " + divisao); break;
            case 4 :System.out.println("A diferença do maior pelo  é: "); break;
            default:System.out.println("Digite 1 ,2 , 3 ou 4 para executar"); 
            
        }

        entrada.close();
    }
}
