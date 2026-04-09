package com.kaua8.imc.Service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class ImcServiceTest {

    @Autowired
    ImcService imcService = new ImcService();

    double peso = 75;
    double altura = 1.60;
    double imc = imcService.imc(peso, altura);
    String classificacao = imcService.classificacao(imc);

    @Test
    void testaCalculoIMC() {
        assertEquals(29.296874999999993, imc);
    }

    @Test
    void testaClassificacaoIMC() {
        assertEquals("SOBREPESO", classificacao);
    }
}