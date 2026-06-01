
import java.util.Scanner;

public class  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese cantidad de términos: ");
        int n = sc.nextInt();

        int a = 0, b = 1, i = 0;

        System.out.println("Serie:");
        while (i < n) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
            i++;
        }
    }
}
