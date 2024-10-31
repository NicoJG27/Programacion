package Tema4.Bucles;

import java.util.Scanner;

public class T4ejemplo1 {
    public static void main(String[] args) {
        // Scanner
        Scanner sc = new Scanner(System.in);

        int contador = 0;
        int suma = 0;
        int numero ;
        do {
            numero = sc.nextInt();
            if (numero != 0) contador++;
            suma = suma + numero;
            } while (numero != 0);
        
        
        System.out.println("Se han introducido " + contador + " numeros en total y " +
        "la suma de todos ellos es " + suma + ".");
        
        // Cerrar scanner
        sc.close();

    }
    }

