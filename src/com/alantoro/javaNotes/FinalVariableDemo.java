package com.alantoro.javaNotes;

public class FinalVariableDemo {

    public static void run() {
        System.out.println("--- FinalVariableDemo ---");

        final float gravedadLuna;
        // ... cálculos previos
        gravedadLuna = 162.0f; // Se puede asignar UNA vez

        System.out.println("Gravedad Luna: " + gravedadLuna);

        // Si intentas reasignar:
        // gravedadLuna = 170.0f; // ❌ Error de compilación: variable final ya asignada
        System.out.println();
    }
}