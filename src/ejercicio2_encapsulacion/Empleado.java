package ejercicio2_encapsulacion;

/**
 * Clase Empleado con atributos privados y métodos de acceso.
 * Demuestra el concepto de encapsulación protegiendo los datos: un valor
 * inválido no reemplaza un estado que ya era válido.
 *
 * @author José Mauricio Chavarría González - cg92088
 * @author Kelvin Antonio Velázquez Vásquez - vv22015
 * @version 1.1
 * @since Agosto 2026
 */
public class Empleado {
    // Atributos privados
    private String nombre;
    private int edad;

    /**
     * Constructor que inicializa nombre y edad.
     * No permite crear un empleado con datos inválidos.
     *
     * @param nombre Nombre del empleado
     * @param edad   Edad del empleado
     * @throws IllegalArgumentException si el nombre o la edad no son válidos
     */
    public Empleado(String nombre, int edad) {
        if (!esNombreValido(nombre)) {
            throw new IllegalArgumentException("Error: El nombre no puede estar vacío.");
        }
        if (!esEdadValida(edad)) {
            throw new IllegalArgumentException("Error: La edad debe ser mayor que 0 y menor que 100.");
        }
        this.nombre = nombre;
        this.edad = edad;
    }

    /**
     * Obtiene el nombre del empleado.
     *
     * @return Nombre del empleado
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del empleado.
     * Si el valor es inválido, se conserva el nombre anterior.
     *
     * @param nombre Nombre del empleado (no puede estar vacío)
     */
    public void setNombre(String nombre) {
        if (!esNombreValido(nombre)) {
            System.out.println("Error: El nombre no puede estar vacío. Se conserva el valor anterior.");
            return;
        }
        this.nombre = nombre;
    }

    /**
     * Obtiene la edad del empleado.
     *
     * @return Edad del empleado
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Establece la edad del empleado.
     * Valida que esté en el rango 1-99. Si el valor es inválido, se conserva
     * la edad anterior.
     *
     * @param edad Edad del empleado
     */
    public void setEdad(int edad) {
        if (!esEdadValida(edad)) {
            System.out.println("Error: La edad debe ser mayor que 0 y menor que 100. Se conserva el valor anterior.");
            return;
        }
        this.edad = edad;
    }

    /**
     * Muestra la información del empleado.
     */
    public void mostrarInformacion() {
        System.out.println("Empleado: " + nombre + " | Edad: " + edad + " años");
    }

    private boolean esNombreValido(String nombre) {
        return nombre != null && !nombre.trim().isEmpty();
    }

    private boolean esEdadValida(int edad) {
        return edad > 0 && edad < 100;
    }
}
