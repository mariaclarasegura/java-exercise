package exercise4;

public class Televisión extends Electrodomestico{
    public int resolucion;
    public boolean sintonizadorTdt;
    private final int RESOLUCION_DEF=20;
    private final boolean SINTONIZADOR_TDT_DEF=false;

    public Televisión(){
    }

    public Televisión(int precio, int peso){
        super(precio, peso);
    }

    public Televisión(int resolucion, boolean sintonizadorTdt){
        super();
    }

    public int getResolucion() {
        return resolucion;
    }

    public boolean isSintonizadorTdt() {
        return sintonizadorTdt;
    }

    public int precioFinal() {
        double precio = super.precioFinal();
        if (resolucion>40){
            precio = (precio*1.30);
        }
        if (sintonizadorTdt){
            precio=+50;
        }
        return (int)Math.round(precio);
    }
}
