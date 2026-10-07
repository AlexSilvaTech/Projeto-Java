import java.util.Scanner;

public class temperatura {
    public static void main(String[] args) {
        System.out.println("Calculadora Celsius to Fahrenheit");

        Scanner leitura = new Scanner(System.in);

        System.out.print("Digite a temperatura em Celsius: ");

        double temperatura = Double.parseDouble(leitura.nextLine());

        int calculoTemperatura = (int)((temperatura * 1.8) + 32);
        System.out.println("A temperatura em Fahrenheit é: " + calculoTemperatura);
    }
}
