import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Calculadora del volumen de un cono.");
        System.out.println("Introduzca la altura (cm):");
        double altura = sc.nextDouble();
        System.out.println("Introduzca el radio de la base (cm):");
        double base = sc.nextDouble();
        double resultado = Math.PI * base * base *altura / 3;
        System.out.println("El volumen del cono es de: " + resultado + " cm³.");
        sc.close();
        //Nicolás Jiménez Gutiérrez
    }

    
}
