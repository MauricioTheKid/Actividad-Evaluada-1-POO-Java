package ejercicio5_herencia_multinivel;

/**
 * Clase intermedia abstracta Mamifero que hereda de Animal.
 * Añade el comportamiento de alimentar y deja pendiente la implementación
 * de hacerSonido() para las clases concretas.
 *
 * @author José Mauricio Chavarría González - cg92088
 * @author Kelvin Antonio Velázquez Vásquez - vv22015
 * @version 1.1
 * @since Agosto 2026
 */
public abstract class Mamifero extends Animal {
    /**
     * Método específico de los mamíferos.
     */
    public void alimentar() {
        System.out.println("El mamífero está alimentando a sus crías.");
    }
}
