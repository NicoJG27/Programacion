package Tema5;

import java.util.Scanner;

public class Ejercicio8Potencias {
    public static void main(String[] args) {
        //Declaraciones
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        try {
            //Lee el número de teclado
            System.out.print("Introduzca un número: ");
            numero = sc.nextInt();

            //Pinta cabecera tabala
            System.out.println("   n   |    n2   |    n3   |");
            System.out.println("---------------------------");

            //Calcula y pinta las potencias de los 5 siguientes numeros al introducirlo
            for (int i = 1; i <= 5; i++){
                System.out.printf("   %-4d|     %-4d|     %-4d|\n", numero, numero*numero, numero*numero*numero);
                numero++;
            }

        } catch (Exception e) {
            System.out.println("ERROR: Se debe introducir un valor numérico");
        }
        sc.close();
    }

}
