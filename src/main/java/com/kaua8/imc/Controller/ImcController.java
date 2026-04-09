package com.kaua8.imc.Controller;

import com.kaua8.imc.Model.PesoAltura;
import com.kaua8.imc.Service.*;
import com.kaua8.imc.Repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.net.URI;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@Tag(name = "IMC", description = "Endpoits para calculo IMC")
public class ImcController {

    @Autowired
    private ImcService imcService;

    @Autowired
    private ImcRepository imcRepository;

    @PostMapping("/imc/recebePesoAltura")
    @Operation(summary = "Recebe dados", description = "Recebe Peso e Altura e devolve a classificacao IMC")
    public ResponseEntity<Void> receberDados(@RequestBody PesoAltura pesoAltura) {
       imcRepository.save(pesoAltura);
       return ResponseEntity.created(URI.create("/imc/resultado")).build();
    }

    @GetMapping("/imc/resultado")
    @Operation(summary = "Resultado", description = "Devolve a classificao do usuario")
    public String resultado() {
        double peso = imcRepository.getPeso();
        double altura = imcRepository.getAltura();
        double imc = imcService.imc(peso, altura);
        return imcService.classificacao(imc);
    }
}
