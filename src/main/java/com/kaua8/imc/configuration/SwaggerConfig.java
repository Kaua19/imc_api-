package com.kaua8.imc.configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("API para Cálculo IMC")
                        .version("1.0.0")
                        .description("API para cálculo de armazanamneto de Ìndice de Massa Corporal")
                        .contact(new Contact()
                                .name("Kauã")
                                .email("kaua83707@gmail.com")
                                .url("https://github.com/Kaua19"))
                                .license(new License()
                                        .name("MIT License")
                                        .url("https://opensource.org/licenses/MIT")));
    }

}
