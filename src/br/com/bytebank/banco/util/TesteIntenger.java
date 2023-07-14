package br.com.bytebank.banco.util;

public class TesteIntenger {
    public static void main(String[] args) {

        Integer idade = Integer.valueOf(29);
        int valor = idade.intValue();
        System.out.println(valor);

        String s = args[0];
        int numero = Integer.parseInt(s);
        System.out.println(numero);
    }
}
