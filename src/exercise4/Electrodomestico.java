package exercise4;

public class Electrodomestico {
    private int precioBase;
    private String color;
    private char consumoEnergetico;
    private int peso;

    private final int PRECIO_BASE_DEF = 100;
    private final String COLOR_DEF = "Blanco";
    private final char CONSUMO_ELECTRICO = 'F';
    private final int PESO_DEF = 5;

    public Electrodomestico() {
        comprobarConsumoEnergetico(CONSUMO_ELECTRICO);
    }

    public Electrodomestico(int precioInicial, int peso) {
        this.precioBase = precioInicial;
        this.peso = peso;
        this.color = COLOR_DEF;
        this.consumoEnergetico = CONSUMO_ELECTRICO;
        comprobarConsumoEnergetico(CONSUMO_ELECTRICO);
    }

    public Electrodomestico(int precioBase, String color, char consumoEnergetico, int peso) {
        this.precioBase = precioBase;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
        comprobarConsumoEnergetico(consumoEnergetico);
    }

    public int getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public int getPeso() {
        return peso;
    }

    private boolean comprobarConsumoEnergetico(char letra) {
        Letra.comprobarLetra(letra);
    }
}
