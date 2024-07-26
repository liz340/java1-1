import java.util.Scanner;

public class Invertir {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[6];
        int[] invertido = new int[6];

        
        for (int i = 0; i < 6; i++) {
            System.out.print("Ingresa un numero entero: ");
            numeros[i] = scanner.nextInt();
        }

        
        for (int i = 0; i < 6; i++) {
            invertido[i] = numeros[5 - i];
        }

        
        System.out.println("Array invertido:");
        for (int num : invertido) {
            System.out.print(num + " ");
        }
    }
}