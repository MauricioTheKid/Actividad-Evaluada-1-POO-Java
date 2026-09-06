package ejercicio1_abstraccion;

/**
 * Clase que representa una cuenta bancaria.
 * Utiliza abstracción de datos para ocultar el detalle de la implementación del
 * saldo. Las validaciones se comunican con excepciones para no mezclar la
 * lógica del dominio con la salida en consola.
 *
 * @author José Mauricio Chavarría González - cg92088
 * @author Kelvin Antonio Velázquez Vásquez - vv22015
 * @version 1.1
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
     * @throws IllegalArgumentException si el monto no es mayor que 0
     */
    public void depositar(double monto) {
        if (monto <= 0) {
            throw new IllegalArgumentException("Error: El monto a depositar debe ser mayor que 0.");
        }
        saldo += monto;
    }

    /**
     * Permite retirar dinero de la cuenta.
     * Valida que el monto sea positivo y que haya fondos suficientes.
     *
     * @param monto Cantidad a retirar
     * @throws IllegalArgumentException si el monto no es válido o no hay fondos
     */
    public void retirar(double monto) {
        if (monto <= 0) {
            throw new IllegalArgumentException("Error: El monto a retirar debe ser mayor que 0.");
        }

        if (monto > saldo) {
            throw new IllegalArgumentException("Error: Fondos insuficientes.");
        }

        saldo -= monto;
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
