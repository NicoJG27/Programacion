import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Calculadora de nota.");
        System.out.println("Introduzca la nota que saco en el primer examen");
        double examen = sc.nextDouble();
        System.out.println("¿Qué nota quiere sacar en el trimestre?");
        double trimestre = sc.nextDouble();
        double segundo = (trimestre - (examen * 0.4)) / 0.6;
        System.out.println("Para tener un " + trimestre + " en el trimestre necesita sacar un " + segundo + " en el segundo examen.");
        sc.close();
        //Nicolás Jiménez Gutiérrez
    }
}