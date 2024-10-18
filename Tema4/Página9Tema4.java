package Tema4;

import java.util.Scanner;

public class Página9Tema4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un valor comprendido entre 1 y 100:  ");
        int num = sc.nextInt();
        if ((num > 0) && (num <= 100)) {
            System.out.println("¡Enhorabuena! ¡El valor introducido está en el rango indicado!");
        } else {
            System.out.println("!Te he dicho un valor entre 1 y 100!");
        }
        sc.close();

    }
}
