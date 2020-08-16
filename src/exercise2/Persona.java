package exercise2;

public class Persona {
    private final String NOMBRE_DEFAULT = "";
    private final int EDAD_DEFAULT = 0;
    private final char SEXO_DEFAULT = 'H';
    private final double PESO_DEFAULT = 0;
    private final double ALTURA_DEFAULT = 0;

    private String nombre;
    private int edad;
    private char sexo;
    private double peso;
    private double altura;
    private int dni;

    private final int INFRAPESO = -1;
    private final int PESO_IDEAL = 0;
    private final int SOBREPESO = 1;


    public Persona() {
    }

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = PESO_DEFAULT;
        this.altura = ALTURA_DEFAULT;
    }

    public Persona(String nombre, int edad, char sexo, double peso, double altura, int dni) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        this.dni = dni;
    }

    public int calcularIMC() {
        double imc = peso / (altura * altura);
        if (imc < 20) {
            return INFRAPESO;
        }
        if (imc >= 20 & imc <= 25) {
            return PESO_IDEAL;
        } else {
            return SOBREPESO;
        }
    }

    public boolean esMayorDeEdad() {
        return edad >= 18;
    }

    private void comprobarSexo(char sexo) {
        if (sexo != 'H' && sexo != 'M') {
            this.sexo = SEXO_DEFAULT;
        }
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", sexo=" + sexo +
                ", peso=" + peso +
                ", altura=" + altura +
                ", dni=" + dni +
                '}';
    }
}
