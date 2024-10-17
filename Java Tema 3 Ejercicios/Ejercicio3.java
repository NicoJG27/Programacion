import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este progrma convierte el valor dado en pesetas a euros.");
        final double TIPO = 166.386;
        System.out.println("Introduzca la cantidad en pesetas que desee covertir a euros.");
        double pesetas = sc.nextDouble();
        double euros = pesetas / TIPO;
        System.out.println(pesetas + " pesetas son " + euros + " euros ");
        sc.close();
        //Nicolás Jiménez Gutiérrez
    }
}
