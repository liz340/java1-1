import java.util.Scanner;

public class MCD {

    public static int calcularMCD(int a, int b) {
        while (b != 0) {
            int temporal = b;
            b = a % b;
            a = temporal;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el primer numero entero: ");
        int numero1 = scanner.nextInt();
        System.out.print("Ingresa el segundo numero entero: ");
        int numero2 = scanner.nextInt();

        int mcd = calcularMCD(numero1, numero2);
        System.out.printf("El MCD de %d y %d es %d%n", numero1, numero2, mcd);
    }
}

