import java.util.Scanner;

public class CadenaTexto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una cadena de texto: ");
        String input = scanner.nextLine();
        scanner.close();

        if (esPalindromo(input)) {
            System.out.println("Es un palindromo.");
        } else {
            System.out.println("No es un palindromo.");
        }
    }

    public static boolean esPalindromo(String str) {

        str = str.replaceAll("\\s+", "").toLowerCase();

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}