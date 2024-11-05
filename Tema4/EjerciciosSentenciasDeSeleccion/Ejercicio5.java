package Tema4.EjerciciosSentenciasDeSeleccion;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        final double g = 9.81;
        System.out.println("Calculo del timepo de caida de un objeto");
        System.out.print("Introduzca la altura (en metros) desde la que cae el objeto:  ");
        double alt = sc.nextDouble();
        double t = Math.sqrt(alt * 2 / g);
        System.out.printf("El objeto tarda %.2f", t );
        System.out.printf(" segundos.");
        sc.close();
    }
}