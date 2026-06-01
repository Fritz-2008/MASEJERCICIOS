
import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String clave = "1234";
        String ingreso;

        ingreso = sc.nextLine();

        while (!ingreso.equals(clave)) {
            System.out.println("Incorrecta");
            ingreso = sc.nextLine();
        }

        System.out.println("Acceso concedido");
    }
}
