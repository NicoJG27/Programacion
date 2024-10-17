import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        final double TIPO = 1024;
        System.out.println("Conversor de kB a Mb.");
        System.out.println("Introduzca la cantidad de kB: ");
        double kB = sc.nextDouble();
        double Mb = kB / TIPO;
        System.out.println(kB + "kB son " + Mb + "Mb.  ");
        sc.close();
        //Nicolás Jiménez Gutiérrez

    }
}