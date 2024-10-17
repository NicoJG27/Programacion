package EntradaPorteclado2;

import java.util.Scanner;

public class Ejercicio1 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("\033[1mSEGUNDOS QUE TIENE UN DÍA \033[0m");
      System.out.println("==========================");
      System.out.println("Introduzca un número de días: ");
      int dias = sc.nextInt();
      int segundos = dias * 86400;
      System.out.println(dias + " días equivalen a " + segundos + " segundos.");
      sc.close();

   }
}
