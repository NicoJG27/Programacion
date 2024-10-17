import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        final double TIPO = 1024;
        System.out.println("Conversor de Mb a kB.");
        System.out.println("Introduzca la cantidad de Mb: ");
        double Mb = sc.nextDouble();
        double kB = Mb * TIPO;
        System.out.println(Mb + "Mb son " + kB + "Kb.  ");
        sc.close();
        //Nicolás Jiménez Gutiérrez

    }
}