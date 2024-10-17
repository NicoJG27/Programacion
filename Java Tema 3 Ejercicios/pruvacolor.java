public class pruvacolor {
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        System.out.println("\033[48;5;3m Hola mundo\033[0m");
        //lo ultimo es para quitar el color a toda la consola.
        System.out.println("\033[1m Hola mundo\033[0m");
        //negrita
        System.out.println("\033[1m\033[48;5;3m Hola mundo\033[0m");
        //color con negrita
        //033;48.... para color de fondo
        //033;38..... para color de la letra
    }
}
