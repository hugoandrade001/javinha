package br.com.bytebank.banco.modelo;

public class GuardarConta {

    private Object[] referencias;
    private int lugarDisponivel;

    public GuardarConta() {
        this.referencias = new Object[10];

    }

    public void adiciona(Object objeto) {
        this.referencias[0] = objeto;
        this.lugarDisponivel++;

    }

    public int getQuantidadeElementos() {
        return this.lugarDisponivel;
    }

    public Object getReferencia(int pos) {
        return this.referencias[pos];
    }
}
