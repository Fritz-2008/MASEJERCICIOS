import java.util.Scanner;

public class InvertirNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int num = sc.nextInt();

        int invertido = 0;
        int temp = Math.abs(num);

        while (temp > 0) {
            invertido = invertido * 10 + temp % 10;
            temp /= 10;
        }

        if (num < 0) invertido *= -1;

        System.out.println("Número invertido: " + invertido);
    }
}
