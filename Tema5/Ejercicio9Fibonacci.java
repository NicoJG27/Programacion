package Tema5;

import java.util.Scanner;

public class Ejercicio9Fibonacci {
        public static void main(String[] args) {
        //Declaraciones
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        final int PRIMERO = 0;
        final int SEGUNDO = 1;
        int ultimo = 0;
        int penultimo = 1;
        int aux = 0;



        /**
         * Algoritmo que calcula los N primeros numeros de la
         * Serie de Fibonacci
         * 
         * La serie de Fibonacci parte de los números 0 y 1, y
         * a partir de ahi los siguientes numero de la serie son
         * la suma de los dos anterios, por ejemplo:
         * 
         * 0, 1, 1, 2, 3, 5, 8....
         */
       
        try {
            //Lee el número de teclado
            System.out.print("\033[1mN PRIMEROS NÚMEROS DE LA SERIE DE FIBONACCI\033[0m");
            System.out.print("Introduzca un número ");
            numero = sc.nextInt();


            if (numero == 0) System.out.println("0 ");
           else if (numero == 1) System.out.println(PRIMERO + " " + SEGUNDO);
           else{
            System.out.print(PRIMERO + " " + SEGUNDO);
            while (numero > 2) {
                aux = ultimo + penultimo;
                penultimo = ultimo;
                ultimo = aux;
                System.out.print(" " + ultimo);
                numero--;
            }
           }
        } catch (Exception e) {
            System.out.println("ERROR: Se debe introducir un valor numérico");
        }
        sc.close();
    }

}



