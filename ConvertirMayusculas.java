import java.util.Scanner;

public class ConvertirMayusculas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa una palabra o cadena de texto (o presiona Enter para salir):");
        String input = scanner.nextLine();

        while (!input.isEmpty()) {
            String mayusculas = input.toUpperCase();
            System.out.println("Texto en mayusculas: " + mayusculas);

            System.out.println("Ingresa otra palabra o cadena de texto (o presiona Enter para salir):");
            input = scanner.nextLine();
        }

        System.out.println("Hasta luego!");
        scanner.close();
    }
}