package fundamentos;

public class Temperatura {
//    public static void main(String[] args) {
//        double fahrenheit = 80;
//
//        final int ajuste = 32;
//        final double multiplicador = 5/9.0;
//
//        double celsius = (fahrenheit - ajuste) * multiplicador;
//
//        System.out.println("Resultado, temperatura em Celsius: " + celsius);
//        System.out.println("Temperatura em fahrenheit: " + fahrenheit);
//
//    }

    public static void main(String[] args) {
        final double AJUSTE = 32;
        final double MULTIPLICADOR = 5.0 / 9.0;

        double fahrenheit = 86;
        double celsius = (fahrenheit - AJUSTE) * MULTIPLICADOR;
        System.out.println("Resultado, temperatura em Celsius: " + celsius);

        var temperaturaFahrenheit = 86;
        System.out.println("O tipo da variável temperaturaFahrenheit é: " + ((Object)temperaturaFahrenheit).getClass().getSimpleName());


        var a = "Oliveira";
        System.out.println("O tipo da variável a é: " + ((Object)a).getClass().getSimpleName());
    }

}
