package exercise3;

import java.util.UUID;

public class Password {
    private final int LONGITUD_DEF = 8;
    private String contraseña;
    private int longitud;

    public Password() {
    }

    /* TODO IMPLEMENTAR ESTE METODO
     public boolean esFuerte(contraseña){
        if (longitud>11){
        }
    */

    public String generarPassword() {
        if (longitud > 0) {
            return UUID.randomUUID().toString().replace("-", "").substring(0, longitud);
        } else {
            return UUID.randomUUID().toString().replace("-", "").substring(0, LONGITUD_DEF);
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
