package com.kaua8.imc.Model;

import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

public class PesoAltura {

    @Schema(description = "Peso em quilogramas", example = "75.0")
    private double peso;

    @Schema(description = "Altura em metros", example = "1.80")
    private double altura;

    public PesoAltura(double peso, double altura) {
         Objects.requireNonNull(peso, "Peso nao pode ser nulo");
         Objects.requireNonNull(altura, "Altura nao pode ser nulo");
         if (peso <= 0.0 || peso >= 650) {
             throw new RuntimeException("Valor invalido");
         }
         if (altura <= 0.0 || altura >= 3.0) {
             throw new RuntimeException("Valor invalido");
         }
         this.peso = peso;
         this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso <= 0.0 || peso >= 650) {
            throw new RuntimeException("Valor invalido");
        }
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura <= 0.0 || altura >= 3.0) {
            throw new RuntimeException("Valor invalido");
        }
        this.altura = altura;
    }

}
