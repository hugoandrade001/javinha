package br.com.alura.collections;

public class Aluno {
    private String nome;
    private int numeroMatricula;

    public Aluno(String nome, int numeroMatricula) {
        if (nome == null) {
            throw new NullPointerException("nome nao pode ser null");
        }
        this.nome = nome;
        this.numeroMatricula = numeroMatricula;

    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Aluno: " + this.nome + " Matricula: " + this.numeroMatricula;
    }
    @Override
    public boolean equals(Object obj) {
        Aluno outro = (Aluno) obj;
        return this.nome.equals(outro.getNome());
    }

    @Override
    public int hashCode() {

        return this.nome.hashCode();
    }
}
