import java.util.Scanner;

public class CambiarTexto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa una cadena de texto: ");
        String texto = scanner.nextLine();

        System.out.print("Ingresa el carácter que deseas reemplazar: ");
        char caracterAntiguo = scanner.next().charAt(0);

        System.out.print("Ingresa el nuevo carácter: ");
        char caracterNuevo = scanner.next().charAt(0);

        String textoModificado = texto.replace(caracterAntiguo, caracterNuevo);
        System.out.println("Texto modificado: " + textoModificado);

        scanner.close();
    }
}
