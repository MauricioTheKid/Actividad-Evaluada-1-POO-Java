package ejercicio4_polimorfismo;

/**
 * Clase Perro que hereda de Animal y sobrescribe hacerSonido.
 * 
 * @author José Mauricio Chavarría González - cg92088
 * @author Kelvin Antonio Velázquez Vásquez - vv22015
 * @version 1.0
 * @since Agosto 2026
 */
public class Perro extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("El perro ladra: ¡Guau Guau!");
    }
} 