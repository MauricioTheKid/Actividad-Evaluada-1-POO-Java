package ejercicio5_herencia_multinivel;

/**
 * Clase Perro que hereda de Mamifero y sobrescribe hacerSonido.
 *
 * @author José Mauricio Chavarría González - cg92088
 * @author Kelvin Antonio Velázquez Vásquez - vv22015
 * @version 1.1
 * @since Agosto 2026
 */
public class Perro extends Mamifero {
    @Override
    public void hacerSonido() {
        System.out.println("El perro ladra: ¡Guau Guau!");
    }
}
