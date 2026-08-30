package ejercicio5_herencia_multinivel;

/**
 * Clase Perro que hereda de Mamifero y sobrescribe hacerSonido.
 * 
 * @author Jose Mauricio Chavarria Gonzalez - cg92088
 * @author Kelvin Antonio Velazquez Vasquez - vv22015
 * @version 1.0
 * @since Agosto 2026
 */
public class Perro extends Mamifero {
    @Override
    public void hacerSonido() {
        System.out.println("El perro ladra: Guau Guau!");
    }
}