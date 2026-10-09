package fundamentos;

public class Interferencia {
    static void main() {

        // A variável a é do tipo double, mas o valor atribuído a ela é um inteiro. O Java faz a conversão automática de int para double.
        double a = 5.0;
        System.out.println("O tipo da variável a é: " + ((Object)a).getClass().getSimpleName());

        a = 12;
        System.out.println("Resultado: " + a);


        // A variável b é do tipo double, mas o valor atribuído a ela é um inteiro. O Java faz a conversão automática de int para double.
        var b = 5.0;
        System.out.println("Resultado: " + b);

        var c = "Oliveira";
        System.out.println("O tipo da variável c é: " + ((Object)c).getClass().getSimpleName());

        // A variável c é do tipo String, mas o valor atribuído a ela é outro String. O Java faz a conversão automática de String para String.
        c = "Outro Sobrenome";
        System.out.println("Resultado: " + c);


    }
}
