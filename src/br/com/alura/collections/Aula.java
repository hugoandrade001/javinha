package br.com.alura.collections;

public class Aula implements Comparable<Aula> {
    private String titulo;
    private int tempo;

    public Aula(String nome, int tempo) {
        this.titulo = nome;
        this.tempo = tempo;
    }

    public String getNome() {
        return titulo;
    }

    public int getTempo() {
        return tempo;
    }

    @Override
    public int compareTo(Aula outraAula) {
        return this.titulo.compareTo(outraAula.titulo);
    }
    @Override
    public String toString() {
        return "[Aula: " + this.titulo + ", " + this.tempo + " minutos]";
    }
}
