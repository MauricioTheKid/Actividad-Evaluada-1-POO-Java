package ejercicio2_encapsulacion;

/**
 * Clase principal para probar la encapsulación.
 *
 * @author José Mauricio Chavarría González - cg92088
 * @author Kelvin Antonio Velázquez Vásquez - vv22015
 * @version 1.1
 * @since Agosto 2026
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println(" EJERCICIO 2: ENCAPSULACIÓN ");
        System.out.println("==========================================\n");

        // Empleado válido
        System.out.println("--- Empleado con datos válidos ---");
        Empleado emp1 = new Empleado("Juan Pérez", 30);
        emp1.mostrarInformacion();

        System.out.println("\n--- Pruebas de validación ---");
        // Intentos con valores inválidos: el estado válido se conserva
        emp1.setEdad(150);
        emp1.setNombre("");

        System.out.println("\n--- Estado actual del empleado ---");
        emp1.mostrarInformacion();

        // Empleado con edad inválida en constructor
        System.out.println("\n--- Empleado con datos inválidos ---");
        try {
            Empleado emp2 = new Empleado("Ana", -5);
            emp2.mostrarInformacion();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n==========================================\n");
    }
}
