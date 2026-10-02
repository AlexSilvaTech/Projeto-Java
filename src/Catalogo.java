public class Catalogo {
    public static void main(String[] args){
        System.out.println("Essa é a GameCorp");
        System.out.println("Jogo: Lies of P");
        int anoDeLancamento = 2023;
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        if (incluidoNoPlano) {
            System.out.println("Incluído no plano GC!");
        } else {
            System.out.println("Não está incluído no plano GC!");
        }
        double notaDoJogo = 8.1;
        System.out.println("Nota do jogo: " + notaDoJogo);
    }
}