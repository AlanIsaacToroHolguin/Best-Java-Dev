
package com.alantoro.javaNotes;

public class MathOperators {

    public static void run() {
        System.out.println("=== 1) Operaciones básicas ===");
        int a = 11;
        int b = 6;

        int suma = a + b;            // 11 + 6 = 17
        int resta = a - b;           // 11 - 6 = 5
        int multiplicacion = a * b;  // 11 * 6 = 66
        int divisionEntera = a / b;  // 11 / 6 = 1 (entera, trunca decimales)
        int modulo = a % b;          // 11 % 6 = 5 (resto de la división)

        System.out.println("a = " + a + ", b = " + b);
        System.out.println("suma: " + suma);                  // 17
        System.out.println("resta: " + resta);                // 5
        System.out.println("multiplicación: " + multiplicacion); // 66
        System.out.println("división entera: " + divisionEntera); // 1
        System.out.println("módulo (resto): " + modulo);         // 5

        System.out.println("\n=== 2) Asignaciones compuestas (+=, -=, *=, /=, %=) ===");
        int x = 10;
        x += 5;   // x = x + 5 => 15
        x -= 3;   // x = x - 3 => 12
        x *= 2;   // x = x * 2 => 24
        x /= 4;   // x = x / 4 => 6 (entera)
        x %= 5;   // x = x % 5 => 1
        System.out.println("Resultado final de x: " + x); // 1

        System.out.println("\n=== 3) Incremento y decremento (++ y --) ===");
        int y = 5;
        System.out.println("y (inicial): " + y); // 5
        System.out.println("y++ (post-incremento, devuelve 5, luego y=6): " + (y++));
        System.out.println("y ahora: " + y); // 6
        System.out.println("++y (pre-incremento, y=7, devuelve 7): " + (++y));
        System.out.println("y-- (post-decremento, devuelve 7, luego y=6): " + (y--));
        System.out.println("y ahora: " + y); // 6
        System.out.println("--y (pre-decremento, y=5, devuelve 5): " + (--y));

        System.out.println("\n=== 4) Precedencia de operadores ===");
        // * y / tienen mayor precedencia que + y -
        int p1 = 2 + 3 * 4;          // 2 + (3*4) = 14
        int p2 = (2 + 3) * 4;        // (2+3) * 4 = 20
        int p3 = 10 - 6 / 3 + 2 * 5; // 10 - 2 + 10 = 18
        System.out.println("2 + 3 * 4 = " + p1);      // 14
        System.out.println("(2 + 3) * 4 = " + p2);    // 20
        System.out.println("10 - 6 / 3 + 2 * 5 = " + p3); // 18

        System.out.println("\n=== 5) División entera vs. con decimales ===");
        int n1 = 7, n2 = 2;
        int divEntera = n1 / n2;                 // 7 / 2 = 3
        double divDecimal1 = (double) n1 / n2;   // 3.5
        double divDecimal2 = n1 / (double) n2;   // 3.5
        double divDecimal3 = (double) (n1 / n2); // 3.0 (¡cuidado! convierte después de truncar)
        System.out.println("7 / 2 (int) = " + divEntera);
        System.out.println("7 / 2 (double) = " + divDecimal1);
        System.out.println("7 / 2 (double) = " + divDecimal2);
        System.out.println("(double)(7 / 2) = " + divDecimal3);

        System.out.println("\n=== 6) Casting, límites y overflow ===");
        int maxInt = Integer.MAX_VALUE; // 2147483647
        System.out.println("Integer.MAX_VALUE = " + maxInt);
        int overflow = maxInt + 1; // Overflow: se desborda y envuelve a negativo
        System.out.println("maxInt + 1 (overflow) = " + overflow);

        // Casting explícito
        double d = 9.99;
        int truncado = (int) d; // 9 (trunca decimales)
        System.out.println("double 9.99 -> (int) = " + truncado);

        // Cuidado con el cast en multiplicaciones grandes
        long safeMult = (long) 50_000 * 50_000; // evitar overflow de int
        System.out.println("50,000 * 50,000 (long) = " + safeMult);




        System.out.println("\n=== 8) Operaciones combinadas y ejercicios rápidos ===");
        int m = 20, n = 7;
        // Combinadas en una sola línea con comentarios
        int res1 = (m += 5) - (n *= 2); // m=25, n=14 -> 25 - 14 = 11
        System.out.println("(m += 5) - (n *= 2) = " + res1 + " | m=" + m + ", n=" + n);

        m = 20; n = 7;
        int res2 = (m %= 6) + (++n);   // m=20%6=2, ++n=8 -> 2 + 8 = 10
        System.out.println("(m %= 6) + (++n) = " + res2 + " | m=" + m + ", n=" + n);

        m = 20; n = 7;
        int res3 = (m -= n++) * 2;     // m=13, n post=8 -> 13*2=26
        System.out.println("(m -= n++) * 2 = " + res3 + " | m=" + m + ", n=" + n);

        System.out.println("\n=== 9) Errores comunes a evitar ===");
        System.out.println("- División por cero lanza ArithmeticException (int). Evita hacer: 10 / 0");
        System.out.println("- Recuerda que / con int trunca; usa cast a double para decimales.");
        System.out.println("- Cuidado con overflow en int al multiplicar números grandes.");

        System.out.println("\n=== Fin de demostración ===");
    }
}
