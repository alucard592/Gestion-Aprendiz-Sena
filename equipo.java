package com.sena;

public class Equipo {
    private String codigo;
    private String nombre;
    private String categoria;
    private boolean disponible;

    // CONSTRUCTOR: Aplica la regla de "disponible = true" al crear
    public Equipo(String codigo, String nombre, String categoria) {
        if (codigo == null || codigo.trim().isEmpty()) {
            throw new IllegalArgumentException("El código no puede estar vacío");
        }
        this.codigo = codigo;
        this.nombre = nombre;
        this.categoria = categoria;
        this.disponible = true; // Parámetro inicial por defecto
    }

    // Métodos de comportamiento
    public void marcarComoPrestado() { this.disponible = false; }
    public void marcarComoDevuelto() { this.disponible = true; }

    // Getters necesarios para la Tarea 2
    public String getCodigo() { return codigo; }
    public boolean isDisponible() { return disponible; }
    
    @Override
    public String toString() {
        return "ID: " + codigo + " | " + nombre + " [" + (disponible ? "DISPONIBLE" : "OCUPADO") + "]";
    }
}
