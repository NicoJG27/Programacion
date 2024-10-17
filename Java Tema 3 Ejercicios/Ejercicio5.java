import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculadora de Area de un rectángulo.");
        System.out.println("Introduzca la base:");
        float base = sc.nextFloat();
        System.out.println("Introduzca la altura:");
        float altura = sc.nextFloat();
        System.out.println("El area de su rectangulo es de: " +  base * altura);
        sc.close();
        //Nicolás Jiménez Gutiérrez
    }
}
