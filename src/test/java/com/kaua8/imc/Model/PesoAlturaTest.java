package com.kaua8.imc.Model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PesoAlturaTest {

    PesoAltura dado = new PesoAltura(75, 1.80);

    @Test
    void getPeso() {
        assertEquals(75, dado.getPeso());
        assertEquals(1.80, dado.getAltura());
    }

    @Test
    void deveLanacarExcecaoParaPesoInvalido() {

        assertThrows(RuntimeException.class, () -> {
            dado.setPeso(655);
        });

    }

    @Test
    void deveLanacarExcecaoParaAlturaInvalido() {

        assertThrows(RuntimeException.class, () -> {
            dado.setAltura(3.30);
        });

    }
}