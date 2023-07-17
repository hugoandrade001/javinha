package br.com.bytebank.banco.modelo;

import Projeto.Cliente;
/**
 * Classe que representa a moldura de uma conta
 * @author Hugo
 */
public abstract class Conta implements Comparable<Conta> {
    protected double saldo;
    private int agencia;
    private int numero;
    private Projeto.Cliente titular;
    private static int total;

    /**
     * Construtor da conta
     * @param agencia
     * @param numero
     */
    public Conta(int agencia, int numero){
        Conta.total++;
        this.agencia = agencia;
        this.numero = numero;

    }

    public abstract void deposita(double valor);

    /**
     * Valor precisa ser maior que o saldo
     * @param valor
     * @throws SaldoInsuficienteException
     */
    public void saca(double valor) throws SaldoInsuficienteException {
        if (this.saldo < valor) {
            throw new SaldoInsuficienteException("Saldo " + this.saldo + "Valor: " + valor);
        }

        this.saldo -= valor;
    }

    public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
        this.saca(valor);
        destino.deposita(valor);
    }

    public double getSaldo(){
        return this.saldo;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setNumero(int numero){
        if(numero <= 0) {
            System.out.println("Nao pode valor menor igual a 0");
            return;
        }
        this.numero = numero;
    }

    public int getAgencia(){
        return this.agencia;
    }

    public void setAgencia(int agencia){
        if(agencia <= 0) {
            System.out.println("Nao pode valor menor igual a 0");
            return;
        }
        this.agencia = agencia;
    }

    public void setTitular(Cliente titular){
        this.titular = titular;
    }

    public Cliente getTitular(){
        return this.titular;
    }

    public static int getTotal(){
        return Conta.total;
    }

    @Override
    public boolean equals(Object ref) {

        Conta outra = (Conta) ref;
        if (this.agencia != outra.agencia) {
            return false;
        } if (this.numero != outra.numero) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Numero: " + this.numero;
    }

    @Override
    public int compareTo(Conta outra)  {
        return Double.compare(this.saldo, outra.saldo);
    }


}
