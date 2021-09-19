package br.deivid.java;

import java.util.ArrayList;
import java.util.List;

public class ExercicioDois {

    public static void main(String[] args) {

        List<String> palavras = new ArrayList<>();
        palavras.add("alura online");
        palavras.add("casa do código");
        palavras.add("caelum");

        ComparadorTamanho comparador = new ComparadorTamanho();
        palavras.sort((s1, s2) -> Integer.compare(s1.length(),s2.length()));
        System.out.println(palavras);

        System.out.println("=================================================");

        palavras.forEach( s -> System.out.println(s));

        System.out.println("=================================================");

        new Thread(() -> System.out.println("Executando um Runnable")).start();

    }
}

