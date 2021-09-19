package br.deivid.java;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class ExercicioSeis {
    public static void main(String[] args) {

        LocalDate now = LocalDate.now();

        System.out.println(now);

        LocalDate data = LocalDate.of(2099, Month.JANUARY, 25);

        System.out.println(data);

        LocalDate agora = LocalDate.now();
        LocalDate dataFutura = LocalDate.of(2099, Month.JANUARY, 25);

        Period periodo = Period.between(agora, dataFutura);

        System.out.println(periodo.getDays());
        LocalTime start = LocalTime.of(1, 20, 25, 1024);
        LocalTime end = LocalTime.of(3, 22, 27, 1544);

        long duration = Duration.between(start, end).getSeconds();

        System.out.println(duration);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataFormatada = formatter.format(now);

        System.out.println(dataFormatada);

    }
}
