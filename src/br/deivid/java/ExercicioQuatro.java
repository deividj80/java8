package br.deivid.java;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class ExercicioQuatro {

    public static void main(String[] args) {

        List<Curso> cursos = new ArrayList<Curso>();
        cursos.add(new Curso("Python", 45));
        cursos.add(new Curso("JavaScript", 150));
        cursos.add(new Curso("Java 8", 113));
        cursos.add(new Curso("C", 55));

        cursos.sort(Comparator.comparingInt(Curso::getAlunos));
        cursos.forEach( curso -> System.out.println(curso.getNome()));

        System.out.println("=================================================");

        cursos.stream()
                .filter(c -> c.getAlunos() > 50)
                .forEach( c -> System.out.println(c.getNome()));

        System.out.println("=================================================");

        Stream<String> nomes = cursos.stream().map(Curso::getNome);

        nomes.forEach(System.out::println);

        System.out.println("=================================================");

        Stream<Integer> alunos = cursos.stream()
                .filter(c -> c.getAlunos() > 50)
                .map(c -> c.getAlunos());

        alunos.forEach(System.out::println);

    }
}

class Curso {
    private String nome;
    private int alunos;

    public Curso(String nome, int alunos) {
        this.nome = nome;
        this.alunos = alunos;
    }

    public String getNome() {
        return nome;
    }

    public int getAlunos() {
        return alunos;
    }
}