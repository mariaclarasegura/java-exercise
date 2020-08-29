package exercise4;

public class Contabilidad {
    public static int calcularPrecio(char letra, int peso) {
        int precioFinal = 0;
        if (Letra.getChar(Letra.A) == letra) {
            precioFinal = +100;
        }
        if (Letra.getChar(Letra.B) == letra) {
            precioFinal = +80;
        }
        if (Letra.getChar(Letra.C) == letra) {
            precioFinal = +60;
        }
        if (Letra.getChar(Letra.D) == letra) {
            precioFinal = +50;
        }
        if (Letra.getChar(Letra.E) == letra) {
            precioFinal = +30;
        }
        if (Letra.getChar(Letra.F) == letra) {
            precioFinal = +10;
        }
        if (peso > 0 && peso < 19) {
            precioFinal = +10;
        }
        if (peso > 20 && peso < 49) {
            precioFinal = +50;
        }
        if (peso > 50 && peso < 79) {
            precioFinal = +80;
        }
        if (peso > 80) {
            precioFinal = +100;
        }
        return precioFinal;
    }
}
