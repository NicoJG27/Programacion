import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculadora de Area de un triángulo.");
        System.out.println("Introduzca la base:");
        float base = sc.nextFloat();
        System.out.println("Introduzca la altura:");
        float altura = sc.nextFloat();
        System.out.println("El area de su triángulo es de: " +  base * altura / 2);
        sc.close();
        //Nicolás Jiménez Gutiérrez
    }
    
}
