package Tema5;

import java.util.Scanner;

public class Ejercicio16PIRAMIDE {
    public static void main(String[] args) {
        // Declaraciones
        String relleno = "";
        int altura = 0;
        Scanner sc = new Scanner(System.in);

        // Entrada por tecldao de la altura
        try {
            while (altura <= 0) {

                System.out.print("Introduzca altura de la piramide: ");
                altura = sc.nextInt();
                if (altura <= 0) {
                    System.out.println("ERROR: La altura debe ser un entero positivo");
                }
            }
        } catch (Exception e) {
            System.out.println("ERROR: La altura debe ser un entero positivo");
           
        }finally{
            sc.nextLine();
        }

        // Entrada por teclado del caracter relleno
        while (relleno.length() != 1) {
            System.out.print("Introduzca el caracter de relleno: ");
            relleno = sc.nextLine();
            if (relleno.length() != 1) {
                System.out.println("ERROR: El caracter de relleno debe ser de longitud 1");
            }
        }

        // Cerrear scanner
        sc.close();

        // Pintar la piramide
        int base = 2 * altura - 1;
        int espaciosBlanco = base/2;
        String fila = relleno;
        for (int i = 1; i<= altura; i++){
            for (int blancos = 1; blancos <= espaciosBlanco; blancos++){
                System.out.print(" ");
            }
            System.out.println(fila);
            espaciosBlanco -= 1;
            fila =fila +relleno +relleno;           
        }

    }
}