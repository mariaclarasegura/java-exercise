package exercise1;

public class Main {
    public static void main(String[] args) {
        /*
        1) Crea una clase llamada Cuenta que tendrá los siguientes atributos: titular y cantidad (puede tener decimales).
        El titular será obligatorio y la cantidad es opcional. Crea dos constructores que cumpla lo anterior.
        Crea sus métodos get, set y toString.
        Tendrá dos métodos especiales:
        ingresar(double cantidad): se ingresa una cantidad a la cuenta, si la cantidad introducida es negativa, no se hará nada.
        retirar(double cantidad): se retira una cantidad a la cuenta, si restando la cantidad actual a la que nos pasan es negativa, la cantidad de la cuenta pasa a ser 0.
         */

        Cuenta cuenta2 = new Cuenta("maria clara",100);
        cuenta2.ingresar(20);
        cuenta2.retirar(150);
        System.out.println(cuenta2.getCantidad());
        Cuenta cuenta3 = new Cuenta("emmanuel", 10);
        System.out.println(cuenta3.toString());

    }
}