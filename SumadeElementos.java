import java.util.Scanner;

public class SumadeElementos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];
        int suma = 0;

        
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingresa un numero entero: ");
            numeros[i] = scanner.nextInt();
            suma += numeros[i]; 
        }

        
        System.out.println("La suma de los elementos es: " + suma);
    }
}