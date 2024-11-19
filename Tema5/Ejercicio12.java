package Tema5;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        // Declaraciones
        int base = 0;
        int exponenteMax = 0;
        int potencia = 1;
        Scanner sc = new Scanner(System.in);

        // Leemos base y exponentes
        System.out.print("Introduzca la base: ");
        base = sc.nextInt();
        System.out.print("Introduzca el exponente maximo: ");
        exponenteMax = sc.nextInt();

        for (int exponente = 1; exponente <= exponenteMax; exponente++) {
            for (int i = 1; i <= exponente; i++) {
                potencia *= base;
            }
            System.out.println(base + " ^ " + exponente + " = " + potencia);
            potencia = 1;
        }

        sc.close();
    }

}
