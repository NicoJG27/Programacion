package Tema4.EjerciciosSentenciasDeSeleccion;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una hora del día (0-23):  ");
        int hora = sc.nextInt();
        String saludo ="";
       
        if (hora >= 6 && hora <= 12) {
            saludo = "Buenos dias.";
        }else if (hora >= 12 && hora <= 20) {
            saludo = "Buenas tardes.";
        }else if (hora >= 20 && hora <= 23) {
            saludo = "Buenas noches.";
        }
        System.out.println(saludo);
        sc.close();
    }
}
