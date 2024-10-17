package EntradaPorteclado2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\033[1mVOLUMEN DE UNA ESFERA\033[0m");
        System.out.println("==========================");
        System.out.println("Introduzca el radio de la esfera (cms): ");
        double rad = sc.nextDouble();
        double vol = 4 * Math.PI * rad * rad * rad / 3;
        System.out.println("El volumen del toróide es de \033[1m\033[38;5;9m" + vol + "\033[0m\033[0m cm\u00B3.");
        sc.close();
    }
}
