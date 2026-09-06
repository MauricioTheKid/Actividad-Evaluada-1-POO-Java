package ejercicio3_herencia;

/**
 * Clase derivada Coche que hereda de Vehiculo.
 * Demuestra la herencia simple al extender las funcionalidades
 * y reutilizar el constructor de la clase base con super().
 *
 * @author José Mauricio Chavarría González - cg92088
 * @author Kelvin Antonio Velázquez Vásquez - vv22015
 * @version 1.1
 * @since Agosto 2026
 */
public class Coche extends Vehiculo {
    private int numeroPuertas;

    /**
     * Constructor que inicializa la marca heredada y el número de puertas.
     *
     * @param marca         Marca del coche
     * @param numeroPuertas Número de puertas
     */
    public Coche(String marca, int numeroPuertas) {
        super(marca);
        this.numeroPuertas = numeroPuertas;
    }

    /**
     * Método específico de la clase Coche.
     */
    public void conducir() {
        System.out.println("El coche " + marca + " de " + numeroPuertas + " puertas está siendo conducido.");
    }
}
