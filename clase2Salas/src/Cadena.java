import java.util.Scanner;

public class Cadena {
    public static boolean cadenas(String textoA, String textoB) {
        return !textoA.equals(textoB);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer texto: ");
        String textoA = scanner.nextLine();
        System.out.print("Ingrese el segundo texto: ");
        String textoB = scanner.nextLine();

        boolean sonDistintas = cadenas(textoA, textoB);
        System.out.println(sonDistintas);
    }
}