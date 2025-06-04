
# backend-ecommerce

**Este é um projeto inicial de um e-commerce simples, desenvolvido para fins estudantis, focado na venda de teclados e componentes para teclados.**

## Tecnologias Utilizadas
   
- Java
- Spring Boot
- Maven
- PostgreSQL

## Objetivo

O objetivo deste projeto é proporcionar um ambiente de aprendizado prático sobre desenvolvimento de APIs RESTful, autenticação JWT, integração com banco de dados relacional e boas práticas de desenvolvimento backend.

## Como executar

1. **Clone o repositório**
2. **Gere as chaves JWT**  
   Siga as instruções em `src/main/resources/keys/generate-ur-keys.md` para gerar as chaves pública e privada.
3. **Configure o banco de dados**  
   Renomeie o arquivo `src/main/resources/application.properties-example`para application.properties e coloque as credenciais do seu banco PostgreSQL.
4. **Instale as dependências e execute o projeto**
   ```bash
   ./mvnw spring-boot:run
   ```

## Estrutura do Projeto

- `src/main/java` — Código fonte da aplicação
- `src/main/resources` — Configurações e recursos (chaves, properties)
- `src/main/resources/keys` — Chaves para autenticação JWT

## Contribuição

Sinta-se à vontade para contribuir com melhorias, correções ou sugestões.

---
Projeto para fins didáticos.
```