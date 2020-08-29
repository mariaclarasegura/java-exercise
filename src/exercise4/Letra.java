package exercise4;

public enum Letra {
    A,
    B,
    C,
    D,
    E,
    F;


    public static boolean comprobarLetra(char letra) {
        return letra == getChar(A) ||
                letra == getChar(B) ||
                letra == getChar(C) ||
                letra == getChar(D) ||
                letra == getChar(E) ||
                letra == getChar(F);
    }

    private static char getChar(Letra letra) {
        return letra.toString().charAt(0);
    }
}
