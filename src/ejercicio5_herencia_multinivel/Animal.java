package ejercicio5_herencia_multinivel;

/**
 * Clase base Animal.
 * 
 * @author Jose Mauricio Chavarria Gonzalez - cg92088
 * @author Kelvin Antonio Velazquez Vasquez - vv22015
 * @version 1.0
 * @since Agosto 2026
 */
public class Animal {
    /**
     * Metodo que sera sobrescrito en las clases derivadas.
     */
    public void hacerSonido() {
        System.out.println("El animal hace un sonido generico.");
    }
}