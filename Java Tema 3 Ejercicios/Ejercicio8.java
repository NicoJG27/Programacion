import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculadora de sueldo en funcion de horas trabajadas");
        System.out.println("Introduzca las horas trabajadas: ");
        int horas = sc.nextInt();
        int paga = 12;
        System.out.println("Su sueldo es de: " + horas * paga + " euros.");
        sc.close();
        //Nicolás Jiménez Gutiérrez
    }

}
 