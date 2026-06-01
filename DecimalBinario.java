import java.util.Scanner;

public class DecimalBinario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese número decimal: ");
        int num = sc.nextInt();

        if (num == 0) {
            System.out.println("Binario: 0");
            return;
        }

        String bin = "";

        while (num > 0) {
            bin = (num % 2) + bin;
            num /= 2;
        }

        System.out.println("Binario: " + bin);
    }
}
