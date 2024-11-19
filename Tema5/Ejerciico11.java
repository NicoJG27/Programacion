package Tema5;

import java.util.Scanner;

public class Ejerciico11 {
    public static void main(String[] args) {
        //Declaraciones
        int base = 0;
        int exponente = 0;
        int potencia = 1;
        Scanner sc = new Scanner(System.in);

        //Leemos base y exponentes
        System.out.print("Introduzca la base: ");
        base = sc.nextInt();
        System.out.print("Introduzca el exponente: ");
        exponente = sc.nextInt();

        //Calculamos la potencia
       
        for (int i = 1; i <= exponente; i++)
        {
            potencia = potencia * base;

        }
        System.out.println("La potencia base " + base + " y expoente " + exponente + " es " + potencia);

        //Cerramos scanner
        sc.close();
    }

}
