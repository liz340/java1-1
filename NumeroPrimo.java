import java.util.Scanner;

public class NumeroPrimo {

    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un numero entero: ");
        int numero = scanner.nextInt();
        if (esPrimo(numero)) {
            System.out.println("El numero es primo.");
        } else {
            System.out.println("El numero no es primo.");
         
    }
        }
}