package atividadeUm;

import java.util.Scanner;

public class exe9 {
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        int nascimento, anoAtual, idadeAtual, idadeFutura;

        System.out.println("Digite o ano de seu nascimento: ");
        nascimento = leia.nextInt();

        System.out.println("Digite o ano atual");
        anoAtual = leia.nextInt();

        idadeAtual = anoAtual - nascimento;
        idadeFutura = 2080 - nascimento;

        System.out.println("Sua idade atual é: " + idadeAtual + 
        " e sua idade em 2080 será: " + idadeFutura);
    }
}
