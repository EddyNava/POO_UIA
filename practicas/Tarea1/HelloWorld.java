import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner entradaUsuarioScanner = new Scanner(System.in);
        System.out.print("¿Cómo te llamas? ");
        String entradaNombreUsuario = entradaUsuarioScanner.nextLine();
        System.out.println("Hola " + entradaNombreUsuario + "!");
    }
}