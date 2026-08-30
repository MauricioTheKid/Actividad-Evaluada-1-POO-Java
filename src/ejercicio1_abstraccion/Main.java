package ejercicio1_abstraccion;

/**
 * Clase principal para probar la abstracción de datos.
 * 
 * @author José Mauricio Chavarría González - cg92088
 * @author Kelvin Antonio Velázquez Vásquez - vv22015
 * @version 1.0
 * @since Agosto 2026
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("   EJERCICIO 1: ABSTRACCIÓN DE DATOS     ");
        System.out.println("==========================================\n");

        CuentaBancaria cuenta = new CuentaBancaria();

        // Operaciones válidas
        System.out.println("--- Operaciones válidas ---");
        cuenta.depositar(1000);
        cuenta.retirar(250);
        System.out.printf("Saldo final: $%.2f%n", cuenta.obtenerSaldo());

        // Pruebas de validación
        System.out.println("\n--- Pruebas de validación ---");
        cuenta.depositar(-50); // Error: monto negativo
        cuenta.retirar(2000); // Error: fondos insuficientes

        System.out.println("\n==========================================\n");
    }
}