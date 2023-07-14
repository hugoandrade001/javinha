package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencias {
    public static void main(String[] args) {
        Conta[] contas  = new Conta[5];

        ContaCorrente c1 = new ContaCorrente(22, 33);
        ContaPoupanca c2 = new ContaPoupanca(33, 22);


        contas[0] = c1;
        contas[1] = c2;

        ContaPoupanca ref = (ContaPoupanca) contas[1];

        System.out.println("A: " + contas[1].getNumero());
        System.out.println(ref.getNumero());
    }
}
