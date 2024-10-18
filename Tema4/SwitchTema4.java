package Tema4;

import java.util.Scanner;

public class SwitchTema4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca su nota, para que el programa determine su valor:");
        int nota = sc.nextInt();
        String notaTexto = "";

        switch (nota) {
            case 0, 1, 2, 3, 4:
                notaTexto = "Suspenso";
                break;
            case 5:
                notaTexto = "Aprobado";
                break;
            case 6:
                notaTexto = "Bien";
                break;
            case 7, 8:
                notaTexto = "Notable";
                break;
            case 9, 10:
                notaTexto = "Sobresaliente";
                break;
            default:
                notaTexto = "ERROR: Nota Invalida.";
        }
        System.out.println("La nota introducida equivale a un: " + notaTexto);
        sc.close();
    }
}
