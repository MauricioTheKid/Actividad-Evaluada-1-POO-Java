package ejercicio1_abstraccion;

/**
 * Clase principal para probar la abstracción de datos.
 *
 * @author José Mauricio Chavarría González - cg92088
 * @author Kelvin Antonio Velázquez Vásquez - vv22015
 * @version 1.1
 * @since Agosto 2026
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println(" EJERCICIO 1: ABSTRACCIÓN DE DATOS ");
        System.out.println("==========================================\n");

        CuentaBancaria cuenta = new CuentaBancaria();

        // Operaciones válidas
        System.out.println("--- Operaciones válidas ---");
        try {
            cuenta.depositar(1000);
            System.out.printf("Depósito exitoso. Saldo actual: $%.2f%n", cuenta.obtenerSaldo());
            cuenta.retirar(250);
            System.out.printf("Retiro exitoso. Saldo actual: $%.2f%n", cuenta.obtenerSaldo());
            System.out.printf("Saldo final: $%.2f%n", cuenta.obtenerSaldo());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // Pruebas de validación
        System.out.println("\n--- Pruebas de validación ---");
        try {
            cuenta.depositar(-50);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            cuenta.retirar(2000);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n==========================================\n");
    }
}
