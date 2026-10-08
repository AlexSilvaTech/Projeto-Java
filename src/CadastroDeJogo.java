import java.util.Scanner;

public class CadastroDeJogo {
    public static void main(String[] args) {
        System.out.println("Sistema de Cadastro de Jogos GC!");

        Scanner leitura = new Scanner(System.in);
        boolean encontrado = false;
        String [] generos = {"Souls-like", "RPG", "Ação", "Aventura", "Terror", "Estratégia"};


        System.out.print("Digite o nome do Jogo: ");
        String nomeDoJogo = leitura.nextLine();

        System.out.print("Digite o gênero do jogo: ");
        String generoDigitado = leitura.nextLine();

        System.out.print("Digite o ano de lançamento: ");
        int anoDelancamento = Integer.parseInt(leitura.nextLine());


        for (String genero : generos) {
            if (genero.equals(generoDigitado)) {
                encontrado = true;
                break;
            }
        }

        System.out.printf("""
                Nome do jogo: %s
                Gênero: %s
                Ano de lançamento: %d
                %n""", nomeDoJogo, generoDigitado, anoDelancamento);

        if (encontrado) {
            System.out.println("Gênero cadastrado!");
        } else {
            System.out.println("Gênero não encontrado!");

        }


        if (anoDelancamento >= 2023) {
            System.out.println("Esse é um lançamento recente!");
        } else {
            System.out.println("Esse não é um lançamento recente!");
        }
    }
}
