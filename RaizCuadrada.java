import java.util.Scanner;

public class RaizCuadrada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un numero: ");
        double numero = scanner.nextDouble();

        double raizCuadrada = Math.sqrt(numero);
        System.out.println("La raiz cuadrada de " + numero + " es: " + raizCuadrada);

        scanner.close();
    }
}