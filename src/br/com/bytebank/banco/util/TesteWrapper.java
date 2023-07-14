package br.com.bytebank.banco.util;

public class TesteWrapper {
    public static void main(String[] args) {

        Integer idade = Integer.valueOf(29);
        int valor = idade.intValue();

        Double dRef = Double.valueOf(2.3); //autoboxing
        System.out.println(dRef.doubleValue()); //unboxing

        Boolean bRef = Boolean.FALSE;
        System.out.println(bRef.booleanValue());
    }
}
