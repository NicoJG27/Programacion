package Tema5;

import java.util.Scanner;

public class Ejercicio5CajaFuerte {
    public static void main(String[] args) {
        // Declaraciones
        final int OPORTUNIDADES = 4;
        int contador = 1;
        String combinacion = "0000";
        boolean acierto = false;
        Scanner sc = new Scanner(System.in);

        /*
         * ESTE SWITCH RELLENA DE CEROS A LA IZQUIERDA L ACOMBINACION SI ESTA ES UN NUMERO MENOR QUE 1000 (MENOS DE 4 DIGITOS) 
         * 
         * switch (combinacion.length()) {
         * case 1:
         * combinacion = "000" + combinacion;
         * break;
         * case 2:
         * combinacion = "00" + combinacion;
         * case 3:
         * combinacion = "0" + combinacion;
         * break;
         * }
         */

        while (!acierto && contador <= OPORTUNIDADES) {
            System.out.println("Introduce la ocntraseña de la caja fuerte: ");
            String intento = sc.nextLine();

            // Comprueba
            if (intento.equals(combinacion)) {
                acierto = true;
                System.out.println("\033[1m Se ha abierto la caja fuerte \033[0m");
            } else {
                System.out.println("Clave incorrecta");
            }
            // Incrementar contador
            ++contador;

        }
        if (!acierto) {
            System.out.println("Lo siento, se ha agotado los 4 intentos. \n Se ha emitido un aviso a la policia.");
        }
        sc.close();
    }
}
