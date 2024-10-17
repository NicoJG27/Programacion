package EntradaPorteclado2;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\033[1mCALCULADORA DE MEDIDAS IMPERIALES\033[0m");
        System.out.println("==========================");
        System.out.println("Introduce una longitud en metros:");
        int metros = sc.nextInt();
        System.out.println("\033[1m" + metros + " metros \033[0m son:");
        double pulgadas = metros * 39.3701;
        double pies = metros * 3.28084;
        double yardas = metros * 1.09361;
        System.out.println("\033[48;5;11m" + pulgadas + " pulgadas \033[0m");
        System.out.println("\033[48;5;10m" + pies + " pies \033[0m");
        System.out.println("\033[48;5;9m" + yardas + " yardas \033[0m");
        sc.close();
    }
}