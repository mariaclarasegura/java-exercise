package exercise4;

public class Lavadora extends Electrodomestico {
    private int carga;
    private final int CARGA_DEF = 5;

    public Lavadora() {
    }

    public Lavadora(int precio, int peso) {
        super(precio, peso);
        carga=CARGA_DEF;
    }

    public Lavadora(int carga) {
        this.carga=carga;
    }
}
