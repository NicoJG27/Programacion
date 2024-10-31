package Tema4.EjerciciosSentenciasDeSeleccion;

import java.util.Scanner;

public class Ejercicio1ConSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el dia de la semana");
        String dia = sc.nextLine();
        String mensaje = "";
        switch (dia) {
            case "lunes":
                mensaje = "Entorno de Desarrollo";
                break;
            case "martes":
                mensaje = "Programacion";
                break;
            case "miercoles":
                mensaje = "Lenguaje de Marcas";
                break;
            case "jueves":
                mensaje = "Programacion";
                break;
            case "Viernes":
                mensaje = "Programacion";
                break;
            default:
                mensaje = "Dia de la semana incorrecto.";
        }
        System.out.println(mensaje);
        sc.close();
    }

}