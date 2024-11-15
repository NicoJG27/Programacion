package Tema5;

import java.util.Scanner;

public class Ejercicio7MediaArit {
    public static void main(String[] args) {

        int numero = 0;
        int valor = 0;
        float contador = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Este programa la media de los numeros positivos introducidos");
        System.out.println("Para parar introduzca un numero negativo.");
        System.out.println("Vaya introduciendo números: ");
        while (numero >= 0) {
            try {
                numero = sc.nextInt();
                if (numero >= 0) {
                    valor += numero;
                    contador++;
                }
            } catch (Exception e) {
                System.out.println("Error: solo permite valores numericos");
                sc.nextLine();
            }
        }

        float media = valor / contador;
        System.out.println("La media de los numeros introducidos es " + media);
        sc.close();
    }

}
