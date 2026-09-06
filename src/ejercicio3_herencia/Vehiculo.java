package ejercicio3_herencia;

/**
 * Clase base Vehiculo con métodos arrancar y detener.
 *
 * @author José Mauricio Chavarría González - cg92088
 * @author Kelvin Antonio Velázquez Vásquez - vv22015
 * @version 1.1
 * @since Agosto 2026
 */
public class Vehiculo {
    protected String marca;

    /**
     * Constructor que inicializa la marca del vehículo.
     *
     * @param marca Marca del vehículo
     */
    public Vehiculo(String marca) {
        this.marca = marca;
    }

    /**
     * Método que arranca el vehículo.
     */
    public void arrancar() {
        System.out.println("El vehículo " + marca + " ha arrancado.");
    }

    /**
     * Método que detiene el vehículo.
     */
    public void detener() {
        System.out.println("El vehículo " + marca + " se ha detenido.");
    }
}
