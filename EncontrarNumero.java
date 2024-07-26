import java.util.Scanner;

public class EncontrarNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[8];
        int menor;
        int mayor;

        
        for (int i = 0; i < 8; i++) {
            System.out.print("Ingresa un numero entero: ");
            numeros[i] = scanner.nextInt();
        }

        
        menor = numeros[0];
        mayor = numeros[0];

        
        for (int num : numeros) {
            if (num > mayor) {
                mayor = num;
            }
            if (num < menor) {
                menor = num;
            }
        }

        
        System.out.println("El numero mayor es: " + mayor);
        System.out.println("El numero menor es: " + menor);
    }
}