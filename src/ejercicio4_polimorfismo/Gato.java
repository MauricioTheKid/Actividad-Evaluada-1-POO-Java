package ejercicio4_polimorfismo;

/**
 * Clase Gato que hereda de Animal y sobrescribe hacerSonido.
 *
 * @author José Mauricio Chavarría González - cg92088
 * @author Kelvin Antonio Velázquez Vásquez - vv22015
 * @version 1.1
 * @since Agosto 2026
 */
public class Gato extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("El gato maúlla: ¡Miau Miau!");
    }
}
