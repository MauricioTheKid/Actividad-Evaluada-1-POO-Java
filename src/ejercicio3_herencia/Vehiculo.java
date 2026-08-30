package ejercicio3_herencia;

/**
 * Clase base Vehiculo con métodos arrancar y detener.
 * 
 * @author José Mauricio Chavarría González - cg92088
 * @author Kelvin Antonio Velázquez Vásquez - vv22015
 * @version 1.0
 * @since Agosto 2026
 */
public class Vehiculo {
    /**
     * Método que arranca el vehículo.
     */
    public void arrancar() {
        System.out.println("El vehículo ha arrancado.");
    }

    /**
     * Método que detiene el vehículo.
     */
    public void detener() {
        System.out.println("El vehículo se ha detenido.");
    }
}