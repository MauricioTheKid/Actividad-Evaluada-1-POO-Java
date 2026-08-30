package ejercicio1_abstraccion;

/**
 * Clase que representa una cuenta bancaria.
 * Utiliza abstracción de datos para ocultar el detalle de la implementación del
 * saldo.
 * 
 * @author José Mauricio Chavarría González - cg92088
 * @author Kelvin Antonio Velázquez Vásquez - vv22015
 * @version 1.0
 * @since Agosto 2026
 */
public class CuentaBancaria {
    // Atributo privado: solo accesible dentro de la clase
    private double saldo;

    /**
     * Constructor: inicializa el saldo en 0.
     */
    public CuentaBancaria() {
        this.saldo = 0;
    }

    /**
     * Permite depositar dinero en la cuenta.
     * 
     * @param monto Cantidad a depositar (debe ser positiva)
     */
    public void depositar(double monto) {
        if (monto <= 0) {
            System.out.println("Error: El monto a depositar debe ser mayor que 0.");
            return;
        }
        saldo += monto;
        System.out.printf("Depósito exitoso. Saldo actual: $%.2f%n", saldo);
    }

    /**
     * Permite retirar dinero de la cuenta.
     * Valida que el monto sea positivo y que haya fondos suficientes.
     * 
     * @param monto Cantidad a retirar
     */
    public void retirar(double monto) {
        if (monto <= 0) {
            System.out.println("Error: El monto a retirar debe ser mayor que 0.");
            return;
        }

        if (monto > saldo) {
            System.out.println("Error: Fondos insuficientes.");
            return;
        }

        saldo -= monto;
        System.out.printf("Retiro exitoso. Saldo actual: $%.2f%n", saldo);
    }

    /**
     * Devuelve el saldo actual de la cuenta.
     * 
     * @return Saldo actual
     */
    public double obtenerSaldo() {
        return saldo;
    }
}