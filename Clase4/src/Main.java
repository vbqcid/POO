public class Main {
    public static void main(String[] args){
        UsuarioJuego intento1;
        intento1 = new UsuarioJuego("Ana", "pass");
        intento1.aumentarPuntaje();
        intento1.bonus(12);
        intento1.subirNivel();
    }
}