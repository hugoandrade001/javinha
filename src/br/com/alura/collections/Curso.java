package br.com.alura.collections;

import java.util.*;

public class Curso {
   private String nome;
   private String instrutor;
   private List<Aula> aulas = new ArrayList<Aula>();
   private Set<Aluno> alunos = new HashSet<>();
   private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();

    public Curso(String nome, String instrutor) {
        if (nome == null) {
            throw new NullPointerException();
        }
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public String getNome() {
        return nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public List<Aula> getAulas() {
        return Collections.unmodifiableList(aulas);
    }
    public void adiciona(Aula aula) {
        this.aulas.add(aula);
    }
    public int getTempoTotal() {
        return this.aulas.stream().mapToInt(Aula::getTempo).sum();
    }

    @Override
    public String toString() {
        return "Curso: " + nome + " Tempo total: " + this.getTempoTotal();
    }
    public void matricula(Aluno aluno ){
        this.alunos.add(aluno);
        this.matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);
    }

    public Set<Aluno> getAlunos() {
        return Collections.unmodifiableSet(alunos);
    }

    public boolean estaMatriculado(Aluno aluno) {
        return this.alunos.contains(aluno);
    }


    public Aluno buscaMatriculado(int n) {
        if (!matriculaParaAluno.containsKey(n)) {
            throw new NoSuchElementException();
        }
       return matriculaParaAluno.get(n);
    }
}
