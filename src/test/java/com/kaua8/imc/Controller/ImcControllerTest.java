package com.kaua8.imc.Controller;

import com.kaua8.imc.Model.PesoAltura;
import com.kaua8.imc.Repository.ImcRepository;
import com.kaua8.imc.Service.ImcService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;
import tools.jackson.databind.ObjectMapper;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.mockito.ArgumentMatchers.anyDouble;
import static org.mockito.Mockito.when;import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(ImcController.class)
class ImcControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockitoBean
    private ImcService imcService;

    @MockitoBean
    private ImcRepository imcRepository;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    void  deveRetornarDadosSalvos() throws Exception {

        PesoAltura dado = new PesoAltura(75, 1.80);

        mockMvc.perform(post("/imc/recebePesoAltura")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(dado)))
                        .andExpect(status().isCreated());
    }

    @Test
    void deveRetornarClassificacaoRetorno() throws Exception {
        when(imcRepository.getPeso()).thenReturn(75.0);
        when(imcRepository.getAltura()).thenReturn(1.60);
        when(imcService.imc(anyDouble(), anyDouble())).thenReturn(29.296874999999993);
        when(imcService.classificacao(anyDouble())).thenReturn("SOBREPESO");

        mockMvc.perform(get("/imc/resultado"))
                .andExpect(status().isOk())
                .andExpect(content().string("SOBREPESO"));
    }
}