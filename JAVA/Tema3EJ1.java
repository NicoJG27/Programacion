import java.util.Scanner;

public class Tema3EJ1 {
    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in) ;
       System.out.println("Este progrma multiplica dos numeros enteros.");
       System.out.println("Introduzaca el primer numero por favor.");
       int num1 = sc.nextInt();
       System.out.println("Introduzaca el segundo numero por favor.");
       int num2 = sc.nextInt();
       System.out.println(num1 + " * " + num2 + " = " + num1*num2);
       sc.close();




}
}
