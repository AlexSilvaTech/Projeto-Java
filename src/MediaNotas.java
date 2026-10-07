import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {

        System.out.println("Sistema de calculo de notas");

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double nota1 = Double.parseDouble(leitura.nextLine());
        System.out.println("Digite a segunda nota: ");
        double nota2 = Double.parseDouble(leitura.nextLine());

        double media = (nota1 + nota2) / 2;

        System.out.println("A média das notas é: " + media);
    }
}
