package ejercicio3_herencia;

/**
 * Clase principal para probar la herencia simple.
 *
 * @author José Mauricio Chavarría González - cg92088
 * @author Kelvin Antonio Velázquez Vásquez - vv22015
 * @version 1.1
 * @since Agosto 2026
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println(" EJERCICIO 3: HERENCIA SIMPLE ");
        System.out.println("==========================================\n");

        Coche miCoche = new Coche("Toyota", 4);

        System.out.println("--- Demostración de herencia ---");

        // Métodos heredados de Vehiculo
        miCoche.arrancar();

        // Método propio de Coche
        miCoche.conducir();

        // Método heredado de Vehiculo
        miCoche.detener();

        System.out.println("\n==========================================\n");
    }
}
