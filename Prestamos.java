package com.sena;
import java.util.ArrayList;

public class InventarioPrestamos {
    private ArrayList<Aprendiz> aprendices;
    private ArrayList<Equipo> equipos;
    private ArrayList<Prestamo> prestamos;

    public InventarioPrestamos() {
        this.aprendices = new ArrayList<>();
        this.equipos = new ArrayList<>();
        this.prestamos = new ArrayList<>();
    }

    // Metodo de Registro
    public void registrarEquipo(Equipo e) { equipos.add(e); }
    public void registrarAprendiz(Aprendiz a) { aprendices.add(a); }

    // LoGICA PRINCIPAL: Proceso de prestamo 
    public void procesarPrestamo(int id, String documento, String codigoEquipo) {
        // 1. parametros identificadores
        Aprendiz a = buscarAprendiz(documento);
        Equipo e = buscarEquipo(codigoEquipo);

        // 2. Validaciones de reglas
        if (a == null) {
            System.out.println("ERROR: El aprendiz con documento " + documento + " no existe.");
            return;
        }
        if (e == null) {
            System.out.println("ERROR: El equipo " + codigoEquipo + " no está en el inventario.");
            return;
        }
        if (!e.isDisponible()) {
            System.out.println("ERROR: No se puede prestar. El equipo ya está en uso.");
            return;
        }

        // 3. Relacion
        Prestamo p = new Prestamo(id, a, e);
        e.marcarComoPrestado();
        prestamos.add(p);
        System.out.println("LISTO: " + e.getCodigo() + " entregado a " + a.getNombre());
    }

    // Metodo auxiliar
    private Aprendiz buscarAprendiz(String doc) {
        for (Aprendiz a : aprendices) {
            if (a.getDocumento().equals(doc)) return a;
        }
        return null;
    }

    private Equipo buscarEquipo(String cod) {
        for (Equipo e : equipos) {
            if (e.getCodigo().equals(cod)) return e;
        }
        return null;
    }
}
