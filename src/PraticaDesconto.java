import java.util.Scanner;


public class PraticaDesconto {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Calculadora de descontos!");

        System.out.print("Digite o valor do produto: ");
        double precoOriginal = Double.parseDouble(leitura.nextLine());

        System.out.print("Digite o percentual de desconto: ");
        double percentualDesconto = Double.parseDouble(leitura.nextLine());

        double percentualEmDecimal = percentualDesconto / 100;
        double totalDesconto = percentualEmDecimal * precoOriginal;

        double valorAPagar = precoOriginal - totalDesconto;
        System.out.printf("O desconto foi de: %.2f%n", totalDesconto);
        System.out.printf("O valor final é: %.2f%n", valorAPagar);
    }
}
