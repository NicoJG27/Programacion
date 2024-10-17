import java.util.Scanner;

public class Ejercicio2 {
    
    public static void main(String[] args) {
        //constante que define el tipo de cambio
        final double TIPO = 166.386;
        //definimos e iniciamos scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca una cantidad en euros");
        double euros = sc.nextDouble();

        double pesetas = euros * TIPO;

        System.out.println(euros + " euros son " + pesetas + " pesetas ") ;
        sc.close();
//Nicolás Jiménez Gutiérrez
   
        
    }
}
