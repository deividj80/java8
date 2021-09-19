package br.deivid.java;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class ExercicioUm {

    public static void main(String[] args) {

        List<String> palavras = new ArrayList<>();
        palavras.add("alura online");
        palavras.add("casa do código");
        palavras.add("caelum");

        ComparadorTamanho comparador = new ComparadorTamanho();
        palavras.sort(comparador);
        System.out.println(palavras);

        System.out.println("=================================================");

        Consumer<String> comsumidor = new ComsumidorDeString();
        palavras.forEach(comsumidor);

        System.out.println("=================================================");

        UnaryOperator<String> op = new SubtituirParaTeste();
        palavras.replaceAll(op);
        System.out.println(palavras);



    }
}

class ComsumidorDeString implements Consumer<String> {

    @Override
    public void accept(String s) {
        System.out.println(s);
    }
}

class ComparadorTamanho implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
        if (s1.length() < s2.length())
            return -1;
        if (s1.length() > s2.length())
            return 1;
        return 0;
    }
}

class SubtituirParaTeste implements UnaryOperator<String>{
    @Override
    public String apply(String s) {
        if (s.equals("caelum"))
            return "Teste";
        else
            return s;
    }
}