public class Cambio {
    public static void main(String[] args){
        double valorEmDolares = 34.50;

        double cambio = valorEmDolares * 4.94;

        System.out.println(
                String.format("US$ %.2f equivalem a R$ %.2f", valorEmDolares, cambio)
        );
    }
}
