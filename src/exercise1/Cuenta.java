package exercise1;

public class Cuenta {
    private String titular;
    private double cantidad;


    public Cuenta(String titular) {
        this.titular = titular;
    }

    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getCantidad() {
        return cantidad;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String toString() {
        return "Cuenta{" +
                "titular='" + titular + '\'' +
                ", cantidad=" + cantidad +
                '}';
    }

    public void ingresar(double cantidadIngresada) {
        if (cantidadIngresada > 0) {
            cantidad = cantidad + cantidadIngresada;
        }
    }

    public double retirar(double cantidadRetirada) {
        if (cantidadRetirada >= cantidad) {
            cantidad = 0;
        } else {
            cantidad = cantidad - cantidadRetirada;
        }
        return cantidad;
    }
}
