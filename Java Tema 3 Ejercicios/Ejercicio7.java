import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cálculo total de una factura a partir de una base imponible.");
        System.out.println("Introduzca la base imponible sin IVA:");
        
        double baseimp = sc.nextDouble();
        System.out.printf("Base imponible: %.2f \n", baseimp);
        
        double IVA = 0.21;
        double IVAart = IVA * baseimp;
        System.out.printf("IVA (21%%): %.2f \n", IVAart);

        double total = baseimp + IVAart;
        System.out.println("--------------------------------------");
        System.out.printf("Total: %.2f \n", total);
        
        sc.close();
        //Nicolás Jiménez Gutiérrez
    }
}
