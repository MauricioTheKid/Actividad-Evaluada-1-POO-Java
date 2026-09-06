package ejercicio4_polimorfismo;

/**
 * Clase base abstracta Animal con método hacerSonido.
 * Al ser abstracta no se puede instanciar de forma directa; las clases
 * derivadas deben sobrescribir el comportamiento.
 *
 * @author José Mauricio Chavarría González - cg92088
 * @author Kelvin Antonio Velázquez Vásquez - vv22015
 * @version 1.1
 * @since Agosto 2026
 */
public abstract class Animal {
    /**
     * Método que será sobrescrito por las clases derivadas.
     */
    public abstract void hacerSonido();
}
