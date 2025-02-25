package atividadeUm;
import java.util.Scanner;

public class exe10 {
     public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        double fabrica, lucro, perImposto, distribuidor, venda, imposto;

        System.out.print("Digite o preço de fábrica do carro: ");
        fabrica = scanner.nextDouble();

        System.out.print("Digite o percentual de lucro do distribuidor: ");
        lucro = scanner.nextDouble();

        System.out.print("Digite o percentual de impostos: ");
        perImposto = scanner.nextDouble();

        distribuidor = (lucro / 100) * fabrica;
        imposto = (perImposto / 100) * fabrica;
        venda = fabrica + distribuidor + imposto;

        System.out.printf(" Valor do lucro do distribuidor: " + distribuidor + 
        " , valor correspondente aos impostos: " + imposto + 
        " , preço de venda do veículo: " + venda);

    }
}
