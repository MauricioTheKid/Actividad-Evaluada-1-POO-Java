# Actividad Evaluada 1 – POO en Java

**Universidad de El Salvador**  
**Facultad Multidisciplinaria De Occidente**  
**Departamento de Ingeniería y Arquitectura**  
**Ingeniería En Desarrollo De Software / Educación En Línea**  
**Desarrollo y Reutilización de Software**  
**CICLO II/2026**

---

## 👥 Integrantes

| Nombre | Carnet |
|--------|--------|
| José Mauricio Chavarría González | cg92088 |
| Kelvin Antonio Velázquez Vásquez | vv22015 |

---

## 📋 Descripción

Repositorio con la solución de los 5 ejercicios de la guía de trabajo, implementados en Java.  
Los ejercicios cubren los principios fundamentales de la Programación Orientada a Objetos (POO).

**Lenguaje:** la guía sugiere C#. Esta solución se implementó en **Java** previa consulta con el tutor, aplicando los mismos principios de abstracción, encapsulación, herencia y polimorfismo.

---

## 📂 Estructura del Proyecto

```
src/
├── ejercicio1_abstraccion/
│   ├── CuentaBancaria.java
│   └── Main.java
├── ejercicio2_encapsulacion/
│   ├── Empleado.java
│   └── Main.java
├── ejercicio3_herencia/
│   ├── Vehiculo.java
│   ├── Coche.java
│   └── Main.java
├── ejercicio4_polimorfismo/
│   ├── Animal.java
│   ├── Perro.java
│   ├── Gato.java
│   └── Main.java
└── ejercicio5_herencia_multinivel/
    ├── Animal.java
    ├── Mamifero.java
    ├── Perro.java
    └── Main.java
```

## 📚 Ejercicios

1. **Abstracción de Datos**: `CuentaBancaria` oculta el saldo y valida depósitos/retiros
2. **Encapsulación**: `Empleado` con getters/setters y validación de datos (un valor inválido no pisa el estado válido)
3. **Herencia Simple**: `Vehiculo` → `Coche`, con reutilización del constructor mediante `super()`
4. **Polimorfismo**: `Animal` (abstracta) → `Perro`, `Gato` con sobrescritura de `hacerSonido()`
5. **Herencia Multinivel**: `Animal` → `Mamifero` → `Perro`

---

## ⚙️ Requisitos

- **Java JDK 8 o superior** (recomendado: JDK 11+)
- **Visual Studio Code**
- **Extension Pack for Java** (Microsoft)

---

## 🚀 Cómo Ejecutar

1. Abrir la carpeta del proyecto en VS Code
2. Abrir cualquier archivo `Main.java`
3. Hacer clic en el botón `Run` (▶) o presionar `Ctrl+F5`

Desde terminal, en la raíz del proyecto:

```bash
javac -d bin src/ejercicio1_abstraccion/*.java && java -cp bin ejercicio1_abstraccion.Main
javac -d bin src/ejercicio2_encapsulacion/*.java && java -cp bin ejercicio2_encapsulacion.Main
javac -d bin src/ejercicio3_herencia/*.java && java -cp bin ejercicio3_herencia.Main
javac -d bin src/ejercicio4_polimorfismo/*.java && java -cp bin ejercicio4_polimorfismo.Main
javac -d bin src/ejercicio5_herencia_multinivel/*.java && java -cp bin ejercicio5_herencia_multinivel.Main
```

---

## 📝 Licencia

Este proyecto es de uso académico para la Universidad de El Salvador.
