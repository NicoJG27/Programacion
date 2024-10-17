import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa realiza las 4 operaciones basicas de dos numeros decimales.");
        System.out.println("Introduzca el primer numero: ");
        double num1 = sc.nextDouble();
        System.out.println("Introduzca el segundo numero: ");
        double num2 = sc.nextDouble();

        double suma = num1 + num2;
        double resta = num1 - num2;
        double producto = num1 * num2;
        double cociente = num1 / num2;

        System.out.println("x = " + num1);
        System.out.println("y = " + num2);
        System.out.println("x + y = " + suma);
        System.out.println("x + y = " + resta);
        System.out.println("x * y = " + producto);
        System.out.println("x / y = " + cociente);

        sc.close();
        //Nicolás Jiménez Gutiérrez
    }
}
