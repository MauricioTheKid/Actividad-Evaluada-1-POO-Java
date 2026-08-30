package ejercicio4_polimorfismo;

/**
 * Clase base Animal con método hacerSonido.
 * 
 * @author José Mauricio Chavarría González - cg92088
 * @author Kelvin Antonio Velázquez Vásquez - vv22015
 * @version 1.0
 * @since Agosto 2026
 */
public class Animal {
    /**
     * Método que será sobrescrito por las clases derivadas.
     */
    public void hacerSonido() {
        System.out.println("El animal hace un sonido.");
    }
}