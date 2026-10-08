import java.util.Scanner;

public class MenuGameCorp {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.print("""
                === GAMECORP ===
                1 - Ver catálogo
                2 - Cadastrar jogo
                3 - Ver jogos recomendados
                4 - Sair
                
                Escolha uma opção:
                """);
        int menu = Integer.parseInt(leitura.nextLine());

        switch (menu) {
            case 1:
                System.out.println("Abrindo catálogo...");
                break;
            case 2:
                System.out.println("Abrindo Cadastro de Jogos...");
                break;
            case 3:
                System.out.println("Abrindo Jogos Recomendados...");
                break;
            case 4:
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Opção inválida...");
                break;
        }
    }
}
