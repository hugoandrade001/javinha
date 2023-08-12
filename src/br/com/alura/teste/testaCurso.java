package br.com.alura.teste;

import br.com.alura.collections.Aula;
import br.com.alura.collections.Curso;

import java.util.List;

public class testaCurso {
    public static void main(String[] args) {

        Curso java = new Curso("Java", "Paulo");

        List<Aula> aulas = java.getAulas();
        System.out.println(aulas);
        //java.getAulas().add(new Aula("ArrayList", 21));

        java.adiciona(new Aula("Array", 21));

        System.out.println(aulas);
        System.out.println(java.getAulas());
    }
}
