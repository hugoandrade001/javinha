package br.com.bytebank.banco.util;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.GuardarConta;

public class TesteArrayList {
    public static void main(String[] args) {

        GuardarConta guardarConta = new GuardarConta();
        ContaCorrente cc = new ContaCorrente(22, 11);
        guardarConta.adiciona(cc);
        ContaCorrente cc2 = new ContaCorrente(22, 22);
        guardarConta.adiciona(cc2);
        Cliente cliente = new Cliente();
        guardarConta.adiciona(cliente);

        int tamanho = guardarConta.getQuantidadeElementos();
        System.out.println(tamanho);




    }
}
