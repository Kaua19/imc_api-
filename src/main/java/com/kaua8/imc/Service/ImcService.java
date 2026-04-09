package com.kaua8.imc.Service;

import org.springframework.stereotype.Service;

@Service
public class ImcService {

    public double imc(Double peso, Double altura) {
        return peso / (altura * altura);
    }

    public String classificacao(Double imc) {
        if (imc <= 18.5) {
            return "MAGREZA";
        }else if (imc <= 24.9) {
            return "NORMAL";
        }else if (imc <= 29.9) {
            return "SOBREPESO";
        }else if (imc <= 39.9) {
            return "OBESIDADE";
        } else if (imc >= 40 ) {
            return "OBESIDADE GRAVE";
        }
        return null;
    }

}
