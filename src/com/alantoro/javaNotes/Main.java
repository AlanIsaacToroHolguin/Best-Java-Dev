
// Paquete donde vive esta clase. Organiza el código en un namespace lógico.
package com.alantoro.javaNotes;

// Declaración de la clase principal del programa.
public class Main {

    // Método main: punto de entrada del programa. La JVM empieza aquí.
    public static void main(String[] args) {
        // Imprime un mensaje en la salida estándar (consola).
        System.out.println("Hello and welcome!");

        /*
          Llamadas de ejemplo a otras clases de tus apuntes:
          Cada una de estas clases debe tener un método estático llamado run().
          Esto es útil para ejecutar demostraciones o ejemplos desde un solo lugar.

          NOTA: Si alguna clase no existe o no tiene el método run(), el compilador dará error.
          Puedes comentar estas líneas si aún no has creado esas clases.
         */

        // Ejecuta la demo sobre tipos de datos en Java.
        com.alantoro.javaNotes.DataTypesDemo.run();

        // Ejecuta la demo sobre diferencias entre tipos primitivos y referencias.
        com.alantoro.javaNotes.PrimitiveVsReference.run();

        // Ejecuta la demo sobre variables finales (constantes en Java).
        com.alantoro.javaNotes.FinalVariableDemo.run();

        // Ejecuta la demo sobre operadores matemáticos en Java.
        com.alantoro.javaNotes.MathOperators.run();
    }
}
