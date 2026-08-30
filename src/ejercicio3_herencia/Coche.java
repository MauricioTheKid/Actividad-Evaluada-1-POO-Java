package ejercicio3_herencia;

/**
 * Clase derivada Coche que hereda de Vehiculo.
 * Demuestra la herencia simple al extender las funcionalidades.
 * 
 * @author José Mauricio Chavarría González - cg92088
 * @author Kelvin Antonio Velázquez Vásquez - vv22015
 * @version 1.0
 * @since Agosto 2026
 */
public class Coche extends Vehiculo {
    /**
     * Método específico de la clase Coche.
     */
    public void conducir() {
        System.out.println("El coche está siendo conducido.");
    }
}