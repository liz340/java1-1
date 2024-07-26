import java.util.Scanner;

public class PareseImpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int contadorPares = 0;
        int contadorImpares = 0;


        for (int i = 0; i < 10; i++) {
            System.out.print("Ingresa un numero entero: ");
            numeros[i] = scanner.nextInt();
        }

        for (int num : numeros) {
            if (num % 2 == 0) {
                contadorPares++;
            } else {
                contadorImpares++;
            }
        }

        
        System.out.println("Numeros pares: " + contadorPares);
        System.out.println("Numeros impares: " + contadorImpares);
    }
}