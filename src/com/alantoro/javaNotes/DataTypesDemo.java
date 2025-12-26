package com.alantoro.javaNotes;

public class DataTypesDemo {

    public static void run() {
        // PRIMITIVE DATA TYPES IN JAVA

        // 1. Integer types
        byte numByte = 127;        // 1 byte, range: -128 to 127
        short numShort = 32000;    // 2 bytes, range: -32,768 to 32,767
        int numInt = 2_147_483_647;   // 4 bytes, range: -2^31 to 2^31-1
        long numLong = 9_223_372_036_854_775_807L; // 8 bytes, range: -2^63 to 2^63-1

        // 2. Floating-point types
        float numFloat = 3.14f;           // 4 bytes, ~7 digits
        double numDouble = 3.14159265359; // 8 bytes, ~15 digits

        // 3. Character type
        char letter = 'A'; // 2 bytes, Unicode

        // 4. Boolean type
        boolean isTrue = true; // logical true/false

        // REFERENCE TYPES (NON-PRIMITIVE)
        String text = "Hello Java"; // String object
        Integer numberObj = 100;    // Wrapper for int
        Double decimalObj = 10.5;   // Wrapper for double

        // Imprimir para ver resultados
        System.out.println("--- DatatypesDemo ---");
        System.out.println("byte: " + numByte);
        System.out.println("short: " + numShort);
        System.out.println("int: " + numInt);
        System.out.println("long: " + numLong);
        System.out.println("float: " + numFloat);
        System.out.println("double: " + numDouble);
        System.out.println("char: " + letter);
        System.out.println("boolean: " + isTrue);
        System.out.println("String: " + text);
        System.out.println("Integer (wrapper): " + numberObj);
        System.out.println("Double (wrapper): " + decimalObj);
        System.out.println();
    }
}
