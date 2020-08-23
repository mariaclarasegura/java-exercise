package exercise3;

import java.util.ArrayList;
import java.util.Scanner;

public class Clase {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Cuantas contraseñas querés generar?");
        int cantidadDeContraseñas = entrada.nextInt();
        ArrayList<Password> contraseñas = new ArrayList<>(cantidadDeContraseñas);
        System.out.println("Cuantos caracteres tienen las contraseñas?");
        int longitudContraseñas = entrada.nextInt();
        ArrayList<Boolean> compruebaContraseñas = new ArrayList<>(cantidadDeContraseñas);

        for (int i = 0; i < cantidadDeContraseñas; i++) {
            Password contraseña = new Password();
            contraseña.setLongitud(longitudContraseñas);
            contraseña.generarPassword();
            contraseñas.add(contraseña);
            compruebaContraseñas.add(contraseña.esFuerte());
            System.out.println("La contraseña es " + contraseña.getContraseña() + " Es fuerte? " + contraseña.esFuerte());
        }
    }
}