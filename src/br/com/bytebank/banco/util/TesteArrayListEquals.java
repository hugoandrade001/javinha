package br.com.bytebank.banco.util;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

import java.util.ArrayList;
import java.util.LinkedList;

public class TesteArrayListEquals {
    public static void main(String[] args) {
        LinkedList<Conta > lista = new LinkedList<Conta>();
        ArrayList<String> nomes = new ArrayList<String>();
        ContaCorrente cc = new ContaCorrente(22, 11);
        lista.add(cc);
        ContaCorrente cc2 = new ContaCorrente(33, 11);
        lista.add(cc2);
        ContaCorrente cc3 = new ContaCorrente(22, 11);

        boolean existe = lista.contains(cc2);


        for (Conta conta : lista) {
            if(conta.equals(cc3)) {
                System.out.println("Ja tenho essa conta");
            }
        }
        System.out.println(existe);


    }
}
