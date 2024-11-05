package Tema4.EjerciciosSentenciasDeSeleccion;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("El programa resuelve ecuaciones de primer grado del tipo ax + b = 0");
        System.out.print("Introduzca el valor de a: ");
        double a = sc.nextDouble();
        System.out.print("Ahora introduzca el valor de b: ");
        double b = sc.nextDouble();
        double x = -b / a;
        if (a != 0) {
            x = -b / a;
        } else {
            System.out.println("Esta ecuación no tiene solución real");
        }
        System.out.println("El valor de x es igual a: " + x);
        sc.close();
    }
}