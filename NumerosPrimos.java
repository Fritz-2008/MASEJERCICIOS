import java.util.Scanner;

public class NumerosPrimos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Inicio: ");
        int inicio = sc.nextInt();

        System.out.print("Fin: ");
        int fin = sc.nextInt();

        int contador = 0;

        for (int i = inicio; i <= fin; i++) {
            if (i > 1) {
                boolean esPrimo = true;

                for (int j = 2; j <= i / 2; j++) {
                    if (i % j == 0) {
                        esPrimo = false;
                        break;
                    }
                }

                if (esPrimo) contador++;
            }
        }

        System.out.println("Cantidad de primos: " + contador);
    }
}
