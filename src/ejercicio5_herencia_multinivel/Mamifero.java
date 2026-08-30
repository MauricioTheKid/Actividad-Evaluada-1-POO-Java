package ejercicio5_herencia_multinivel;

/**
 * Clase intermedia Mamifero que hereda de Animal.
 * 
 * @author Jose Mauricio Chavarria Gonzalez - cg92088
 * @author Kelvin Antonio Velazquez Vasquez - vv22015
 * @version 1.0
 * @since Agosto 2026
 */
public class Mamifero extends Animal {
    /**
     * Metodo especifico de los mamiferos.
     */
    public void alimentar() {
        System.out.println("El mamifero esta alimentando a sus crias.");
    }
}