import java.util.Scanner;

public class MenorNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese números (0 para terminar):");

        int num = sc.nextInt();

        if (num == 0) {
            System.out.println("No hay datos");
            return;
        }

        int menor = num;

        while (num != 0) {
            if (num < menor) menor = num;
            num = sc.nextInt();
        }

        System.out.println("Menor: " + menor);
    }
}
