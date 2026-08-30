package ejercicio4_polimorfismo;

/**
 * Clase principal para probar el polimorfismo.
 * 
 * @author José Mauricio Chavarría González - cg92088
 * @author Kelvin Antonio Velázquez Vásquez - vv22015
 * @version 1.0
 * @since Agosto 2026
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("   EJERCICIO 4: POLIMORFISMO             ");
        System.out.println("==========================================\n");

        System.out.println("--- Demostración de polimorfismo ---");

        // Referencias de tipo Animal
        Animal animal1 = new Perro();
        Animal animal2 = new Gato();

        // Llamada polimórfica: se ejecuta el método sobrescrito según el tipo real
        animal1.hacerSonido();
        animal2.hacerSonido();

        System.out.println("\n--- Polimorfismo con array de Animales ---");
        Animal[] animales = { new Perro(), new Gato(), new Animal() };
        for (Animal animal : animales) {
            animal.hacerSonido();
        }

        System.out.println("\n==========================================\n");
    }
}