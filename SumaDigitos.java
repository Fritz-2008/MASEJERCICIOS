import java.util.Scanner;

public class SumaDigitos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
       
        num = Math.abs(num); 
        
        int suma = 0;

        while (num != 0) {
            suma += num % 10;
            num /= 10;
        }

        System.out.println("Suma: " + suma);
        sc.close(); 
    }
}
