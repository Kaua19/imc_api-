package com.kaua8.imc.Repository;

import org.springframework.stereotype.Repository;
import com.kaua8.imc.Model.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ImcRepository {

    List<PesoAltura> pesoAlturas = new ArrayList<>();

    public void save(PesoAltura pesoAltura) {
        pesoAlturas.add(pesoAltura);
    }

    public PesoAltura getDados() {
        return pesoAlturas.get(0);
    }

    public double getPeso() {
        double peso = pesoAlturas.get(0).getPeso();
        return peso;
    }

    public double getAltura() {
        double altura = pesoAlturas.get(0).getAltura();
        return altura;
    }
}
