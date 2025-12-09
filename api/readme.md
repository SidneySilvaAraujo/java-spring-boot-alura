# API Médica – Spring Boot

API REST desenvolvida em Java com Spring Boot para gerenciamento de médicos, utilizando MySQL como banco de dados. O projeto segue a estrutura ensinada nos cursos da Alura.

---

## Banco de Dados

A aplicação usa MySQL.  
Configure o banco no arquivo:

src/main/resources/application.properties

Exemplo:

spring.datasource.url=jdbc:mysql://localhost:3306/vollmed
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha

---

## Arquivo de Requisições

Na raiz do projeto existe a pasta:

/requestes/api.http

Esse arquivo contém todas as requisições prontas para testar a API usando o REST Client do VS Code.

---

## Como Rodar no IntelliJ IDEA

1. Abra o IntelliJ IDEA
2. Clique em **File > Open** e selecione a pasta do projeto
3. Aguarde o IntelliJ baixar as dependências do Maven
4. No painel lateral, abra:  
   src/main/java/med/voll/api/ApiApplication.java
   
5. Clique no ícone **Run** (seta verde) ao lado da classe `ApiApplication`
6. A aplicação será iniciada em:  
   http://localhost:8080
