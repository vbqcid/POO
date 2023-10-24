import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        String nombre = "Vanessa";
        String apellido = "Quinones";
        String fecha = "21/10/1998";
        String iniciales = String.valueOf(nombre.toCharArray()[0]) + String.valueOf(apellido.toCharArray()[0]);
        System.out.println(iniciales);
        String[] separados = fecha.split("/");
        System.out.println(separados[0]);
        System.out.println(separados[1]);
        System.out.println(separados[2]);
    }
}