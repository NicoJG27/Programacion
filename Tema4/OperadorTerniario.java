package Tema4;

import java.util.Scanner;

public class OperadorTerniario {
    public static void main(String[] args) {

        String edadIF = "";
        String edadTerniario = "";

        // Lee la edad numerica del teclado
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduza la nota numerica:");
        int edadNumerica = sc.nextInt();

        // con if-else
        if (edadNumerica >= 18) {
            edadIF = "El usuario es mayor de edad";
        } else {
            edadIF = "El usuario es menor de edad";
        }
        System.out.println(edadIF);

        // con operador terniario

        edadTerniario = (edadNumerica >= 18) ? "El usuario es mayor de edad" : 
                                                "El usuario es menor de edad";
        System.out.println(edadTerniario);
        sc.close();
    }
}
