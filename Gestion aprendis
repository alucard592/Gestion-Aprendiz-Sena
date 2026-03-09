package com.sena;

import java.util.ArrayList;
import java.util.List;

// --- CLASE MODELO ---
class Aprendiz {
    private String id;
    private String nombre;
    private String correo;
    private int edad;

    // Constructor
    public Aprendiz(String id, String nombre, String correo, int edad) {
        this.id = id;
        this.nombre = nombre;
        setCorreo(correo); // Validamos desde la creación
        this.edad = edad;
    }

    // Encapsulamiento con validación interna
    public void setCorreo(String nuevoCorreo) {
        if (nuevoCorreo == null || !nuevoCorreo.contains("@")) {
            throw new IllegalArgumentException("El formato del correo '" + nuevoCorreo + "' es inválido.");
        }
        this.correo = nuevoCorreo;
    }

    public String getCorreo() {
        return this.correo;
    }

    // Método de presentación formateado
    public String fichaTecnica() {
        return String.format("[ID: %s] | Nombre: %-15s | Email: %-25s | Edad: %d", 
                             id, nombre, correo, edad);
    }
}

// --- CLASE PRINCIPAL ---
public class App {

    public static void main(String[] args) {
        
        // 1) Instanciación de objetos con datos de prueba
        Aprendiz userA = new Aprendiz("10102020", "Kevin Rodriguez", "kevin.dev@sena.edu.co", 20);
        Aprendiz userB = new Aprendiz("30304040", "Laura Casallas", "l.casallas@etb.net", 22);
        Aprendiz userC = new Aprendiz("50506060", "Andrés Páez", "apaez@gmail.com", 19);

        // 2) Gestión de colección usando la interfaz List
        List<Aprendiz> listaAprendices = new ArrayList<>();
        listaAprendices.add(userA);
        listaAprendices.add(userB);
        listaAprendices.add(userC);

        // 3) Recorrido y salida de datos
        System.out.println("=== REGISTRO DE APRENDICES SENA ===");
        for (Aprendiz temp : listaAprendices) {
            System.out.println(temp.fichaTecnica());
        }

        // 4) Demostración de Setters y manejo de excepciones
        System.out.println("\n--- Intentando actualizaciones de seguridad ---");
        
        try {
            // Cambio exitoso
            userA.setCorreo("kevin.rodriguez@outlook.com");
            System.out.println("✔ Correo actualizado: " + userA.getCorreo());

            // Intento de asignación errónea (disparará el catch)
            System.out.println("Intentando asignar correo inválido a userB...");
            userB.setCorreo("lauragmail.com"); 

        } catch (IllegalArgumentException e) {
            System.err.println("✘ Error detectado: " + e.getMessage());
        }

        // 5) Verificación final del primer registro
        System.out.println("\nEstado final del primer registro:");
        System.out.println(userA.fichaTecnica());
    }
}
