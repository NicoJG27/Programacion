package Tema14;

import java.util.Scanner;

public class Ejercicio8EcuacionesSegundoGrado {

    public static void main(String[] args) {
        // Parámetros de la ecuación
        double a = 0;
        double b = 0;
        double c = 0;

        // Scanner
        Scanner sc = new Scanner(System.in);

        // Lee parámetros
        boolean parametrosOK = false;
        while (!parametrosOK) {

            try {
                System.out.print("Introduzca el parámetro a: ");
                a = sc.nextDouble();
                System.out.print("Introduzca el parámetro b: ");
                b = sc.nextDouble();
                System.out.print("Introduzca el parámetro c: ");
                c = sc.nextDouble();
                parametrosOK = true;

            } catch (Exception e) {
                System.out.println("ERROR: Parámetros erróneos, deben ser números reales, deben ser números reales");
                sc.nextLine();
            }

        }
        double discriminante = Math.pow(b, 2) - (4 * a * c);

        /*
         * calculamos en funcion del valor del discrimante
         * Si discriminante >= 0 entinces tiene solucion
         * Si no, no tiene solucion real
         */
        double x1 = 0;
        double x2 = 0;
        if (a == 0) {
            System.out.println("La ecuación no tiene infinitas soluciones.");
        } else if (discriminante >= 0) {
            x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.err.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (discriminante == 0){
        } else {
            System.out.println("La ecuación no tiene solución real.");
        }

        sc.close();
    }
}
