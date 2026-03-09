package com.sena;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

/**
 * Pruebas unitarias personalizadas para la entidad Aprendiz.
 */
public class AppTest {

    @Test
    public void validarCreacionAprendiz() {
        // Creamos una instancia de prueba
        Aprendiz testUser = new Aprendiz("1010", "Kevin Prueba", "test@sena.edu.co", 20);

        // Verificamos que el objeto no sea nulo
        assertNotNull("El objeto Aprendiz no debería ser nulo", testUser);

        // Verificamos que los datos se asignen correctamente
        assertEquals("test@sena.edu.co", testUser.getCorreo());
    }

    @Test(expected = IllegalArgumentException.class)
    public void validarCorreoErroneo() {
        // Esta prueba debe pasar si el código lanza la excepción correctamente
        new Aprendiz("2020", "Fallo", "correo-sin-arroba", 25);
    }
}
