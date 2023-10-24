import java.util.Scanner;

public class Maximo {
    public static int maximo(int num1, int num2, int num3) {
        int max = num1;
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();
        System.out.print("Ingrese el tercer número: ");
        int num3 = scanner.nextInt();

        int maximo = maximo(num1, num2, num3);
        System.out.println("El número máximo entre " + num1 + ", " + num2 + " y " + num3 + " es " + maximo);
    }
}
