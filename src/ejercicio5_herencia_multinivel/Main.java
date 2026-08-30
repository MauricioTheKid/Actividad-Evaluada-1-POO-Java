package ejercicio5_herencia_multinivel;

/**
 * Clase principal para probar la herencia multinivel.
 * 
 * @author Jose Mauricio Chavarria Gonzalez - cg92088
 * @author Kelvin Antonio Velazquez Vasquez - vv22015
 * @version 1.0
 * @since Agosto 2026
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("   EJERCICIO 5: HERENCIA MULTINIVEL      ");
        System.out.println("==========================================\n");

        Perro miPerro = new Perro();

        System.out.println("--- Metodos heredados y sobrescritos ---");
        
        // Metodo heredado de Animal (sobrescrito en Perro)
        miPerro.hacerSonido();

        // Metodo heredado de Mamifero
        miPerro.alimentar();

        System.out.println("\n--- Polimorfismo con referencia de tipo Animal ---");
        Animal animalRef = miPerro;
        animalRef.hacerSonido();

        System.out.println("\n--- Polimorfismo con referencia de tipo Mamifero ---");
        Mamifero mamiferoRef = miPerro;
        mamiferoRef.hacerSonido();
        mamiferoRef.alimentar();
        
        System.out.println("\n==========================================\n");
    }
}