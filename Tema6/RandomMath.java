package Tema6;

import java.util.Random;

public class RandomMath {
    public static void main(String[] args) {
        // Números entre [0, 1) con decimales
        for (int i = 1; i < 11; i++) {
            System.out.println(Math.random());
        }

        System.out.println("------------------------------");

        // Números entre [0, 10) con decimales
        for (int i = 1; i < 11; i++) {
            System.out.println(Math.random() * 10);
        }

        System.out.println("------------------------------");

        // Números entre [0, 10) enteros
        for (int i = 1; i < 11; i++) {
            System.out.println((int) (Math.random() * 10));
        }

        System.out.println("------------------------------");

        // Números entre [1, 10] con decimales
        for (int i = 1; i < 11; i++) {
            System.out.println((int) (Math.random() * 10) + 1);
        }

        System.out.println("------------------------------");

        /*
         * Supongamos que encesitamos el intervalo [3,7)
         * Lo haremos paso a paso, partiendo del intervalo [0,1) hasta alcanzar nuestro
         * objetivo
         */
        // paso 1: [0,1)
        System.out.println(Math.random());

        // paso 2: [0,4)
        System.out.println((Math.random() * 4));

        // paso 3: [3,7)
        System.out.println((Math.random() * 4) + 3);

        // paso adicional 1: [3,6] numeros esnteros
        System.out.println((int) (Math.random() * 4) + 3);

        // paso adicional 1: [3,7] numeros esnteros
        System.out.println((int) (Math.random() * 5) + 3);

        System.out.println("------------------------------------------------");

        /*
         * Caso practico: DADO
         * Para simular el lanzamiento de un dado, necesitamos obetener un numero
         * aleatorio en el intervalo [1,6]
         * PARA QUE SEA INTERVALO CERRADO SIEMPRE TENEMOS QUE SUMAR UNO MAS
         */
        int CARAS_DADO_ROL = 12;
        int CARAS_DADO = 6;
        System.out.println("Lanzamiento de Dado:     " + (int) (Math.random() * CARAS_DADO + 1));

        System.out.println("---------------------------------------------------");

        /* ALTERNATIVA CLASE RANDOM */
        Random rand = new Random();
        System.out.println("Lanzamiento de Dado rol RANDOM:     " + (rand.nextInt(CARAS_DADO_ROL) + 1));

        System.out.println("---------------------------------------------------");

        // Intervalo entero [3, 7]
        System.out.println("Lanzamiento de dado con clase Random: " + (rand.nextInt(5) + 3));

    }

}
