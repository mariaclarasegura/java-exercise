package exercise3;

import java.util.UUID;
import java.util.regex.Pattern;

public class Password {
    private final int LONGITUD_DEF = 8;
    private String contraseña;
    private int longitud;

    public Password() {
    }

    public boolean esFuerte() {
        int ocurrenciasMayus = 0;
        int ocurrenciasMinus = 0;
        int ocurrenciasNum = 0;

        for (int i = 0; i < contraseña.length(); i++) {
            if (Character.isUpperCase(contraseña.charAt(i))) {
                ocurrenciasMayus++;
            }
            if (Character.isLowerCase(contraseña.charAt(i))) {
                ocurrenciasMinus++;
            }
            if (Character.isDigit(contraseña.charAt(i))) {
                ocurrenciasNum++;
            }
        }
        return (ocurrenciasMayus > 2 && ocurrenciasMinus > 1 && ocurrenciasNum > 5);

    }

    public void generarPassword() {
        if (longitud > 0) {
            contraseña = UUID.randomUUID().toString().replace("-", "").substring(0, longitud);
        } else {
            contraseña = UUID.randomUUID().toString().replace("-", "").substring(0, LONGITUD_DEF);
        }
    }

    public String getContraseña() {
        return contraseña;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
}
