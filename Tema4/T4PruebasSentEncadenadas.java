package Tema4;

import java.util.Scanner;

public class T4PruebasSentEncadenadas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca su nota, para que el programa determine su valor:");
        int nota = sc.nextInt();

        // sentencia de seleccion encadenada
        if (nota < 5) {
            System.out.println("Suspenso");
        } else if (nota == 5) {
            System.out.println("Aprobado");
        } else if (nota == 6) {
            System.out.println("Bien");
        } else if (nota == 7 || nota == 8) {
            System.out.println("Notable");
        } else if (nota == 9 || nota == 10) {
            System.out.println("Sobresaliente");
        } else {
            System.out.println("Nota invalida");
        }
        sc.close();
    }
}
