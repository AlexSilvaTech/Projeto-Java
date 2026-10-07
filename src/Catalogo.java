public class Catalogo {
    public static void main(String[] args) {

        System.out.println("Essa é a GameCorp");

        String nomeDoJogo = "Lies of P";
        String tipoDoJogo = "Souls-like";
        int anoDeLancamento = 2023;
        double notaDoJogo = 9.3;
        boolean incluidoNoPlano = true;


        String informacaoJogo = """
                Nome do jogo: %s
                Ano de lançamento: %d
                Nota do jogo: %.1f
                """.formatted(nomeDoJogo, anoDeLancamento, notaDoJogo);

        System.out.println(informacaoJogo);

        if (tipoDoJogo.equals("Souls-like")) {
            System.out.println("Esse jogo é um Souls-like!");
        } else {
            System.out.println("Esse jogo pertence a outro gênero.");
        }

        if ((notaDoJogo >= 9.0 && anoDeLancamento >= 2020) || incluidoNoPlano) {
            System.out.println("Destaque GC!");
        } else {
            System.out.println("Sem selo de destaque.");
        }

        if (anoDeLancamento >=2023) {
            System.out.println("Lançamento recente");
        } else if (anoDeLancamento <= 2014){
            System.out.println("Jogo antigo");
        } else {
            System.out.println("Lançado há alguns anos");
        }

        if (anoDeLancamento >= 2023 || notaDoJogo >= 9.0) {
            System.out.println("Recomendação GC!");
        } else {
            System.out.println("Você também pode gostar de...");
        }

        if (anoDeLancamento >= 2020 && notaDoJogo >= 9.0) {
            System.out.println("Jogo altamente recomendado!");
        } else {
            System.out.println("Quem sabe você goste de...");
        }

        if (incluidoNoPlano) {
            System.out.println("Incluído no plano GC!");
        } else {
            System.out.println("Não está incluído no plano GC!");
        }
    }
}