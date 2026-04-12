# 📊 IMC API

API REST para cálculo de **Índice de Massa Corporal (IMC)** com classificação automática de acordo com os critérios da OMS.

---

## 🚀 Tecnologias

![Java](https://img.shields.io/badge/Java-17-orange?style=flat-square&logo=openjdk)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen?style=flat-square&logo=springboot)
![Maven](https://img.shields.io/badge/Maven-3.x-red?style=flat-square&logo=apachemaven)
![Swagger](https://img.shields.io/badge/Swagger-OpenAPI%203-green?style=flat-square&logo=swagger)

---

## 📋 Sobre o Projeto

A **IMC API** recebe os dados de peso e altura de um usuário, calcula o IMC e retorna a classificação correspondente segundo a tabela da Organização Mundial da Saúde.

Os dados são armazenados em memória (ArrayList) durante a execução da aplicação, sem necessidade de banco de dados.

---

## ⚙️ Como Executar

### Pré-requisitos

- Java 17+
- Maven 3.x

### Passos

```bash
# Clone o repositório
git clone https://github.com/Kaua19/imc-api.git

# Acesse a pasta do projeto
cd imc-api

# Execute a aplicação
mvn spring-boot:run
```

A API estará disponível em: `http://localhost:8080`

---

## 📖 Documentação (Swagger)

Com a aplicação rodando, acesse a documentação interativa:

```
http://localhost:8080/swagger-ui/index.html
```

---

## 🔗 Endpoints

### `POST /imc/pesoAltura`

Recebe peso e altura, calcula o IMC e retorna a classificação.

**Request Body:**
```json
{
  "peso": 75.0,
  "altura": 1.80
}
```

**Response (201 Created):**
```json
{
  "classificacao": "Peso normal"
}
```

---

## 📏 Tabela de Classificação (OMS)

| IMC | Classificação |
|-----|--------------|
| Abaixo de 18.5 | Abaixo do peso |
| 18.5 – 24.9 | Peso normal |
| 25.0 – 29.9 | Sobrepeso |
| 30.0 – 34.9 | Obesidade Grau I |
| 35.0 – 39.9 | Obesidade Grau II |
| Acima de 40.0 | Obesidade Grau III |

---

## 🧪 Testes

```bash
mvn test
```

---

## 👨‍💻 Autor

Feito por **Kauã** — estudante de desenvolvimento back-end com foco em Java e Spring Boot.

[![GitHub](https://img.shields.io/badge/GitHub-Kaua19-black?style=flat-square&logo=github)](https://github.com/Kaua19)

---

## 📄 Licença

Este projeto está sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.
