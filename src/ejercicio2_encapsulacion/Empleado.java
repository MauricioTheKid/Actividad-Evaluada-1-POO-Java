package ejercicio2_encapsulacion;

/**
 * Clase Empleado con atributos privados y métodos de acceso.
 * Demuestra el concepto de encapsulación protegiendo los datos.
 * 
 * @author José Mauricio Chavarría González - cg92088
 * @author Kelvin Antonio Velázquez Vásquez - vv22015
 * @version 1.0
 * @since Agosto 2026
 */
public class Empleado {
    // Atributos privados
    private String nombre;
    private int edad;

    /**
     * Constructor que inicializa nombre y edad.
     * 
     * @param nombre Nombre del empleado
     * @param edad   Edad del empleado
     */
    public Empleado(String nombre, int edad) {
        setNombre(nombre);
        setEdad(edad);
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
     * 
     * @param nombre Nombre del empleado (no puede estar vacío)
     */
    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            System.out.println("Error: El nombre no puede estar vacío.");
            this.nombre = "Sin nombre";
        } else {
            this.nombre = nombre;
        }
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
     * Valida que esté en el rango 1-99.
     * 
     * @param edad Edad del empleado
     */
    public void setEdad(int edad) {
        if (edad <= 0 || edad >= 100) {
            System.out.println("Error: La edad debe ser mayor que 0 y menor que 100.");
            this.edad = 0;
        } else {
            this.edad = edad;
        }
    }

    /**
     * Muestra la información del empleado.
     */
    public void mostrarInformacion() {
        System.out.println("Empleado: " + nombre + " | Edad: " + edad + " años");
    }
}