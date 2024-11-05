package Tema4.EjerciciosSentenciasDeSeleccion;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        // Declaraciones
        final float PRECIO_HORA = 12.0f;
        float horas;
        float sueldo;
        final float HORA_EXTRA = 16.0f;

        // Lee las horas trabajadas
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el número de horas trabajadas durante la semana: ");
        horas = sc.nextFloat();

        // Calcula el sueldo semanal
        sueldo = horas * PRECIO_HORA;

        // Muestra el resultado por pantalla

        if (horas <= 40) {
            sueldo = horas * PRECIO_HORA;
        } else  {
            sueldo = ((horas - 40) * HORA_EXTRA) + 40 * PRECIO_HORA;
        }
        System.out.printf("El sueldo semanal que le corresponde es de %.2f euros.\n", sueldo);

        // Cierra scanner
        sc.close();

    }
}