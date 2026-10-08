import java.util.Arrays;
import java.util.Scanner;

public class CatalogoDeGeneros {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        String [] generos = {
                "Souls-like",
                "RPG",
                "Ação",
                "Aventura",
                "Terror",
                "Estratégia"
        };

        for (int i = 0; i < generos.length; i++) {
            System.out.println((i + 1) + "-" + generos[i]);
        }
        System.out.print("Digite um número para escolher o gênero correspondente: ");
        int escolhaGenero = Integer.parseInt(leitura.nextLine());

        //System.out.println("Você escolheu: " + generos[escolhaGenero - 1]);
        switch (escolhaGenero) {
            case 1:
                System.out.println("Você escolheu: " + generos[0]);
                break;
            case 2:
                System.out.println("Você escolheu: " + generos[1]);
                break;
            case 3:
                System.out.println("Você escolheu: " + generos[2]);
                break;
            case 4:
                System.out.println("Você escolheu: " + generos[3]);
                break;
            case 5:
                System.out.println("Você escolheu: " + generos[4]);
                break;
            case 6:
                System.out.println("Você escolheu: " + generos[5]);
                break;
            default:
                System.out.println("Você escolheu uma opção inválida!");
                break;
        }


    }
}
