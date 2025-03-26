package atividadeDois;

import java.util.Scanner;

public class exe9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int voto13 = 0;
        int voto43 = 0;
        int voto;
        
        // Enquanto o código for diferente de 0 ficará no laço de repetição.
        while(true) {
            System.out.println("Digite o número do seu candidato: ");
            System.out.println("13 - Tigrinho da Silva");
            System.out.println("43 - Beijo lento do Santos");
            System.out.println("Digite 0 para encerrar");
            voto = entrada.nextInt();

            if (voto == 0) {
                break;
            } else if(voto == 13) {
                voto13++;
            } else if (voto == 43) {
                voto43++;
            } else {
                System.out.println("Digite uma das opções de candidatos");
            }

        }

        System.out.println("Quantidade de votos em Tigrinho da Silva " + voto13);
        System.out.println("Quantidade de votos em Beijo lento do Santos " + voto43);

        entrada.close();
    }
}
