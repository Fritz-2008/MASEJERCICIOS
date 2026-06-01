import java.util.Scanner;

public class PromedioNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double suma = 0;
        int contador = 0;
        double nota;

        System.out.println("Ingrese notas (-1 para terminar):");

        nota = sc.nextDouble();
        while (nota != -1) {
            suma += nota;
            contador++;
            nota = sc.nextDouble();
        }

        if (contador > 0)
            System.out.println("Promedio: " + (suma / contador));
        else
            System.out.println("No ingresó notas");
    }
}
