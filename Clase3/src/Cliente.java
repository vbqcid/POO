public class Cliente {
    private String numero;
    private String nombre;
    private double deuda;


    public Cliente(String numero, String nombre) {
        this.nombre = nombre;
        this.numero = numero;
    }

    public void incrementarDeuda(double valor){
        this.deuda += valor;
    }

    public void pagarDeuda(){
        this.deuda = 0;
    }

    public double getDeuda(){
        return this.deuda;
    }

    public void setDeuda(double deuda){
        if (deuda > 0) {
            this.deuda = deuda;
        }
    }
}
