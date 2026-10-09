package fundamentos;

import java.net.StandardSocketOptions;

public class AreaCircuferencia {
    static void main() {
        double raio = 3.4;
        //  final é uma constante, ou seja, não pode ser alterada, o ideal é colocar em
        //  maiúsculo, para diferenciar das variáveis.

        final double PI = 3.14159;

        double area = PI * raio * raio;

        System.out.println("Área da circunferência: " + area);

        raio = 10;
        area = PI * raio * raio;
        System.out.println("Área da circunferência: " + area);

    }
}
