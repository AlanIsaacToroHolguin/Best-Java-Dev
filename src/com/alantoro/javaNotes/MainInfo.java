
package com.alantoro.javaNotes;

/**
 * MainInfo: Clase de apuntes ejecutables.
 *
 * - Propósito: Guardar explicaciones detalladas sobre cómo funciona el "Hello World"
 *   y el punto de entrada en Java, pero en un formato que también puedas ejecutar
 *   para ver un resumen en consola.
 *
 * - ¿Cómo usarla?
 *   1) Desde tu clase Main, llama: com.alantoro.javaNotes.MainInfo.run();
 *   2) Observa la salida en consola y revisa los comentarios aquí para el detalle fino.
 *
 * - Recomendación:
 *   Este archivo está lleno de comentarios. Léelos con calma y ejecuta el método run()
 *   para ver el resumen práctico y memorizable.
 */
public class MainInfo {

    /**
     * Método ejecutable que imprime un "resumen de bolsillo" en la consola.
     * El desarrollo profundo está en los comentarios del archivo.
     */
    public static void run() {
        // Encabezado visual
        line();
        title("Hello World en Java: explicación esencial (resumen ejecutable)");
        line();

        // 1) Clase y archivo
        section("1) Clase y archivo");
        println("- En Java, el código vive dentro de CLASES. Una clase es un tipo que agrupa métodos y datos.");
        println("- Si la clase es 'public', el archivo debe llamarse EXACTAMENTE igual: public class Main -> Main.java");
        println("- Las llaves { } delimitan el cuerpo de la clase (lo que contiene).");

        // 2) Método main
        section("2) Método main: punto de entrada");
        println("- La JVM busca exactamente: public static void main(String[] args)");
        println("  public -> la JVM puede llamarlo desde fuera.");
        println("  static -> se invoca sin crear un objeto (Main.main(...)).");
        println("  void -> no devuelve nada.");
        println("  String[] args -> argumentos por línea de comandos (ej.: java Main hola mundo).");

        // 3) System.out.println
        section("3) System.out.println(\"...\")");
        println("- System: clase del paquete java.lang con utilidades del sistema.");
        println("- out: campo estático de tipo PrintStream (la salida estándar: la consola).");
        println("- println: imprime y agrega salto de línea. 'print' imprime sin salto.");

        // 4) Compilar y ejecutar
        section("4) Compilar y ejecutar (CLI)");
        println("1) Compilar:  javac Main.java        -> genera Main.class (bytecode).");
        println("2) Ejecutar:   java Main              -> la JVM carga Main.class y llama a main().");
        println("3) Con paquete: coloca el archivo en carpetas que reflejen el paquete.");
        println("   Ej.: package com.alantoro.javaNotes;");
        println("       Ruta: src/com/alantoro/javaNotes/Main.java");
        println("   Compila: javac src/com/alantoro/javaNotes/Main.java");
        println("   Ejecuta: java -cp src com.alantoro.javaNotes.Main");

        // 5) Errores comunes
        section("5) Errores comunes (evítalos)");
        println("- Archivo no coincide con clase pública -> error de compilación.");
        println("- Falta el ';' al final de la línea -> error.");
        println("- Cambiar la firma de main (ej.: public void main) -> la JVM no lo encuentra.");
        println("- Usar comillas simples '...' para String -> en Java esas son para char.");

        // 6) Conexión con Spring Boot
        section("6) Conexión con tu ruta hacia Spring Boot");
        println("- Spring Boot también usa un método main como punto de entrada:");
        println("  @SpringBootApplication");
        println("  public class App {");
        println("      public static void main(String[] args) {");
        println("          SpringApplication.run(App.class, args);");
        println("      }");
        println("  }");
        println("- La base que estás practicando aquí (firma de main, argumentos, ejecución) es la misma.");

        // 7) Sugerencias de ejercicios
        section("7) Mini ejercicios para afianzar");
        println("A) Imprime los args:");
        println("   for (int i = 0; i < args.length; i++) {");
        println("       System.out.println(\"Arg \" + i + \": \" + args[i]);");
        println("   }");
        println("B) Usa operador ternario para el mensaje:");
        println("   System.out.println(args.length > 0 ? args[0] : \"Hola mundo\");");

        // 8) Recordatorio visual
        section("8) Mapa mental rápido");
        println("- Clase pública -> archivo igual al nombre.");
        println("- main estático -> entrada sin instanciar.");
        println("- String[] args -> parámetros CLI.");
        println("- System.out.println -> salida estándar con salto.");

        line();
        println("Fin del resumen. Revisa los comentarios del archivo para el desglose minucioso.");
        line();
    }

    // ==========================
    // Utilidades de impresión
    // ==========================

    // Imprime una línea separadora.
    private static void line() {
        System.out.println("------------------------------------------------------------");
    }

    // Imprime un título con formato básico.
    private static void title(String text) {
        System.out.println(text.toUpperCase());
    }

    // Imprime el encabezado de sección.
    private static void section(String name) {
        System.out.println();
        System.out.println("► " + name);
    }

    // Atajo para System.out.println
    private static void println(String text) {
        System.out.println(text);
    }
}

/*
===============================
DESGLOSE DETALLADO (COMENTARIOS)
===============================

0) Contexto general:
   - Java es un lenguaje orientado a objetos. Organiza el código en clases.
   - Para ejecutar un programa, la JVM busca un punto de entrada: el método 'main'.

1) public class Main { ... }
   - 'class': define una clase. Dentro puedes tener atributos (datos), métodos (comportamiento), constructores, etc.
*/