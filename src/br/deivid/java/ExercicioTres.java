package br.deivid.java;

import java.util.ArrayList;
import java.util.List;

import static java.util.Comparator.comparing;

public class ExercicioTres {

    public static void main(String[] args) {

        List<String> palavras = new ArrayList<>();
        palavras.add("alura online");
        palavras.add("casa do código");
        palavras.add("caelum");

        palavras.sort(comparing((s) -> s.length()));

        System.out.println(palavras);

        System.out.println("=================================================");

        List<String> palavras2 = new ArrayList<>();
        palavras2.add("alura online");
        palavras2.add("casa do código");
        palavras2.add("caelum");

        palavras2.sort(comparing(String::length));

        System.out.println(palavras2);
        System.out.println("=================================================");

        List<String> palavras3 = new ArrayList<>();
        palavras3.add("alura online");
        palavras3.add("casa do código");
        palavras3.add("caelum");

        palavras3.sort(comparing(String::length));

        System.out.println(palavras3);
        System.out.println("=================================================");

        List<String> palavras4 = new ArrayList<>();
        palavras4.add("alura online");
        palavras4.add("casa do código");
        palavras4.add("caelum");

        palavras4.sort(String.CASE_INSENSITIVE_ORDER);

        System.out.println(palavras4);
        System.out.println("=================================================");

        palavras.forEach( System.out::println );

    }
}

