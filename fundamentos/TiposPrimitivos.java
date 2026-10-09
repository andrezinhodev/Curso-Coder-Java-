package fundamentos;

import javax.sound.midi.SysexMessage;

public class TiposPrimitivos {
    static void main() {
        // Informcoes de um funcionario

        byte anosDeEmpresa = 23;
        short numeroDeVoos = 542;
        int id = 998;
        long pontosAcumulados = 2_134_845_223L;


        // Tipos numericos reais

        float salario = 11_445.44F; // O sufixo F indica que o valor é do tipo float
        double vendasAcumuladas = 2_991_797_103.01; // O sufixo D é opcional, pois o valor é do tipo double por padrão

        // Tipo booleano
        boolean estaDeFerias = false; // ou true

        // Tipo caractere
        char status = 'A'; // Ativo, Inativo, etc.

        // Dias de empresa
        System.out.println("Resultado: " + anosDeEmpresa * 365);

        // Numero de viagens
        System.out.println("Resultado: " + numeroDeVoos / 2);

        // Pontos acumulados
        System.out.println("Resultado: " + pontosAcumulados / vendasAcumuladas);

        System.out.println(id + ":Ganha -> " + salario);

        System.out.println("Ferias? " + estaDeFerias);

        System.out.println("Status: " + status);


    }
}
