package Tema4.EjerciciosSentenciasDeSeleccion;

import java.util.Scanner;

public class Ejercicio13Piramide {
    public static void main(String[] args) {

        // Declaraciones
        
        int orientacion = 0;
        String caracter = "";
        Scanner sc = new Scanner(System.in);

        // Pintar el menú
        do {
            try {
                System.out.println("Este programa pinta una pirámide.");

                // caracter de relleno
                while (caracter.length() != 1) {
                    System.out.println("Introduzca el caracter de relleno: ");
                    caracter = sc.nextLine();
                    if (caracter.length() != 1) {
                        System.out.println("ERROR: El caracter tiene que ser de longitud 1");
                    }
                }

                // Orientación
                System.out.println("Elija un tipo de pirámide:");
                System.out.println("1. Con el vértice hacia arriba");
                System.out.println("2. Con el vértice hacia abajo");
                System.out.println("3. Con el vértice hacia derecha");
                System.out.println("4. Con el vértice hacia izquierda");
                System.out.println("5. Salir");
                System.out.print("Introduzca una opción: ");
                orientacion = sc.nextInt();

                switch (orientacion) {
                    case 1:
                        System.out.println("  " + caracter + "  ");
                        System.out.println(" " + caracter + caracter + caracter + " ");
                        System.out.println(caracter + caracter + caracter + caracter + caracter);
                        break;
                    case 2:
                        System.out.println(caracter + caracter + caracter + caracter + caracter);
                        System.out.println(" " + caracter + caracter + caracter + " ");
                        System.out.println(" " + caracter + " ");
                        break;
                    case 3:
                        System.out.println(caracter);
                        System.out.println(caracter + caracter);
                        System.out.println(caracter + caracter + caracter);
                        System.out.println(caracter + caracter);
                        System.out.println(caracter);
                        break;
                    case 4:
                        System.out.println("" + caracter);
                        System.out.println("" + caracter + caracter);
                        System.out.println(caracter + caracter + caracter);
                        System.out.println("" + caracter + caracter);
                        System.out.println("" + caracter);
                        break;
                    case 5:
                        System.out.println("Gracias po usar el programa, hasta pronto.");
                        break;
                    default:
                        System.out.println("ERROR: La opción debe ser un número del 1 al 5 \n");
                }

            } catch (Exception e) {
                System.out.println("ERROR: la opcion debe ser un número del 1 al 5");
                sc.nextLine();
            } finally {
                sc.nextLine();
            }
        } while (orientacion != 5);
        sc.close();

    }
}
