
package com.alantoro.javaNotes;

public class PrimitiveVsReference {

    public static void run() {
        System.out.println("--- Primitive vs Reference ---");

        // Primitivos: copian el valor
        int a = 5;  // valor 5
        int b = a;  // copia 5
        a = 10;     // cambiar 'a' NO cambia 'b'
        System.out.println("a = " + a + ", b = " + b); // a=10, b=5

        // Referencias: copian la referencia (apuntan al mismo objeto)
        Integer c = 10;  // objeto Integer (ejemplo)
        Integer d = c;   // misma referencia que 'c'
        System.out.println("c = " + c + ", d = " + d); // ambos 10

        // Si reasignas 'd' a un NUEVO objeto, deja de apuntar al mismo:
        d = 0;  // autoboxing crea un nuevo Integer
        System.out.println("c = " + c + ", d = " + d); // c = 10, d = 0
        System.out.println();

        // --- Null en tipos de referencia ---
        // 'null' es un literal que indica ausencia de objeto (solo válido para tipos de referencia).
        System.out.println("--- Null in Reference Types ---");

        String text = null;       // ✅ válido: String es referencia
        Integer number = null;    // ✅ válido: Integer (wrapper) es referencia

        System.out.println("String text = " + text);     // imprime 'null'
        System.out.println("Integer number = " + number); // imprime 'null'

        // Operar sobre una referencia null lanza NullPointerException:
        // System.out.println(text.length()); // ❌ NPE si descomentas

        // Los primitivos NO aceptan null:
        // int primitive = null; // ❌ Error de compilación: tipos primitivos no pueden ser null

        // Ejemplo de check para evitar NPE:
        if (text == null) {
            System.out.println("text está null, asignando valor por defecto...");
            text = "valor por defecto";
        }
        System.out.println("String text (después): " + text);
        System.out.println();
    }
}
