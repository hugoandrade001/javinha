package br.com.alura.teste;

import br.com.alura.collections.Aula;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class testeListaDeAula {
    public static void main(String[] args) {
        Aula aula1 = new Aula("Conhecendo", 21);
        Aula aula2 = new Aula("Tentando", 21);
        Aula aula3 = new Aula("Consegui", 24);

        ArrayList<Aula> aulas = new ArrayList<>();
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);

        Collections.sort(aulas, Comparator.comparing(Aula::getTempo));


    }
}
