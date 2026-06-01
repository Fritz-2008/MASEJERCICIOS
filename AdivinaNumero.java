
import java.util.Scanner;
import java.util.Random;

public class AdivinaNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int numero = rand.nextInt(100) + 1;
        int intento;

        System.out.println("Adivina el número (1-100)");

        intento = sc.nextInt();
        while (intento != numero) {
            if (intento > numero) {
                System.out.println("Muy alto");
            } else {
                System.out.println("Muy bajo");
            }
            intento = sc.nextInt();
        }

        System.out.println("¡Correcto!");
    }
}
