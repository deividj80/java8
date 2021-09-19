package br.deivid.java;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ExercicioCinco {

    public static void main(String[] args) {

        List<Curso> cursos = new ArrayList<Curso>();
        cursos.add(new Curso("Python", 45));
        cursos.add(new Curso("JavaScript", 150));
        cursos.add(new Curso("Java 8", 113));
        cursos.add(new Curso("C", 55));

        cursos.stream()
                .filter(c -> c.getAlunos() > 50)
                .findFirst()
                .ifPresent(c-> System.out.println(c.getNome()));
        System.out.println("=================================================");

        cursos.stream()
                .mapToInt(c -> c.getAlunos())
                .average()
                .ifPresent(System.out::println);

        System.out.println("=================================================");

        List<Curso> stream = cursos.stream()
                .filter(c -> c.getAlunos() > 50)
                .collect(Collectors.toList());
        stream.forEach( c -> System.out.println(c.getNome()));

    }
}

