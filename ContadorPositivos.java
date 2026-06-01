
import java.util.Scanner;

public class ContadorPositivos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contador = 0;
        int num;

        System.out.println("Ingrese números (0 para terminar):");

        num = sc.nextInt();
        while (num != 0) {
            if (num > 0) contador++;
            num = sc.nextInt();
        }

        System.out.println("Cantidad de positivos: " + contador);
    }
}
