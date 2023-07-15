package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;

public class Teste {
    public static void main(String[] args) {
        ContaCorrente c1 = new ContaCorrente(123, 2331);
        c1.deposita(1200);
    }

}
