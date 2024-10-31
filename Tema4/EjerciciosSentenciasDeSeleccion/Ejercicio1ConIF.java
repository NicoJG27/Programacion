package Tema4.EjerciciosSentenciasDeSeleccion;

import java.util.Scanner;

public class Ejercicio1ConIF {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce el dia de la semana");
    String dia = sc.nextLine();

    if (dia.equals( "lunes")) {
        System.out.println("Entornos de Desarrollo");
    }else if (dia.equals( "martes")) {
        System.out.println("Programacion");
    }else if (dia.equals( "miércoles")) {
        System.out.println("Lenguaje de Marcas");
    }else if (dia.equals( "jueves")) {
        System.out.println("Programacion");
    }else if (dia.equals( "viernes")) {
        System.out.println("Programacion");
    }else {
        System.out.println("Dia de la semana incorrecto.");
    }
    sc.close();
    }
}
