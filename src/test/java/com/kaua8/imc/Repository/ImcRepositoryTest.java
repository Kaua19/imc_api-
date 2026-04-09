package com.kaua8.imc.Repository;

import com.kaua8.imc.Model.PesoAltura;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ImcRepositoryTest {

    @Autowired
    ImcRepository imcRepository = new ImcRepository();

    List<PesoAltura> dados = new ArrayList<>();

    @Test
    void save() {

        PesoAltura dado = new PesoAltura(75, 1.80);
        imcRepository.save(dado);

        assertNotNull(dado);
        assertEquals(75, dado.getPeso());
        assertEquals(1.80, dado.getAltura());
    }

}