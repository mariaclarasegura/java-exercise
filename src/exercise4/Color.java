package exercise4;

public enum Color {
    BLANCO,
    NEGRO,
    ROJO,
    AZUL,
    GRIS;

    public static boolean comprobarColor(String color) {
        return color.equals(getString(BLANCO)) ||
                color.equals(getString(NEGRO)) ||
                color.equals(getString(ROJO)) ||
                color.equals(getString(AZUL)) ||
                color.equals(getString(GRIS));
    }

    private static String getString(Color color) {
        return color.toString();
    }
}
