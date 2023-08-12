package br.com.alura.teste;

import br.com.alura.collections.Aluno;
import br.com.alura.collections.Aula;
import br.com.alura.collections.Curso;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class testaCursoAluno {
    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando as coleções do Java",
                "Paulo Silveira");
        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 24));

        Aluno a1 = new Aluno("Rodrigo Turini", 34672);
        Aluno a2 = new Aluno("Guilherme Silveira", 5617);
        Aluno a3 = new Aluno("Mauricio Aniche", 17645);
        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);
        System.out.println("Todos os alunos matriculados no curso: ");
        javaColecoes.getAlunos().forEach(a -> {
            System.out.println(a);
        });
        System.out.println(javaColecoes.estaMatriculado(a1));

        Aluno turini = new Aluno("Rodrigo Turini", 34672);

        System.out.println(turini.equals(a1));
        System.out.println(a1.hashCode() == turini.hashCode());

        Set<Aluno> alunos = new HashSet<>();
        Iterator<Aluno> iterator = alunos.iterator();
        while(iterator.hasNext()) {
            Aluno proximo = iterator.next();
            System.out.println(proximo);
        }
    }
}
