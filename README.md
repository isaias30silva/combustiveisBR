# combustiveisBR
Projeto de estudos - Challenge Java-Backend


![](combustiveisBR_logo.png)
O sistema CombustíveisBR é um projeto prático, desenvolvido para exercitar a compreensão dos principais conceitos relacionados à linguagem de programação Java, banco de dados relacional (MySQL) e frameworks (SpringBoot).

Foi proposto desenvolver uma aplicação completa para uma distribuidora de combustíveis. A API deverá ter as seguintes funcionalidades: 
- Gerenciar Compras e Vendas;
- Gestão de Estoque;
- Cadastro de Clientes e Fornecedores;
- Catálogo de Produtos;
- Cadastro de Usuários/Funcionários;
- Emissão de Relatórios Gerenciais.

## Tecnologias utilizadas
- Java 17;
- Maven;
- Spring Boot 3;
- Spring Security 6;
- Autenticação com JWT;
- Banco de Dados MySQL 8;
- Front-end com Angular e Bootstrap (pendente).

## Como executar a aplicação
- Clonar o repositório com o Git: `git clone https://github.com/isaias30silva/combustiveisBR`
- Criar um banco de dados MySQL de nome `distribuidorabr`
- Atualizar o arquivo `application.properties` com seu usuário e senha do MySQL
- Execute os seguintes comandos no terminal: 
  - `mvn clean`
  - `mvn package -Dmaven.test.skip`
  - `mvn spring-boot:run`
- Após a criação automática das tabelas pelo JPA, execute o arquivo SQL `query_fill_database.sql` para popular as tabelas
- Realizar cadastro de novo usuário no endpoint `http:/localhost:8080/register`, que retornará um token válido para login
- No endpoint `http:/localhost:8080/authenticate`, fazer login no sistema utilizando o CPF recém cadastrado como username, e os 5 primeiros dígitos como senha
- Para testar os endpoints, utilizar o token gerado após o login para autenticação 

Todos os endpoints serão tratados no tópico abaixo

## Documentação da API
Clique <a href="https://documenter.getpostman.com/view/21287524/2s93ecwA48">AQUI</a> para visualizar a documentação dos endpoints da API com exemplos de requests e responses, gerado através do Postman. 

## Diagrama Lógico
![database_diagram](https://github.com/isaias30silva/combustiveisBR/assets/93226440/c91f2afe-23a2-4509-a83e-af659c009a0b)

## Diagrama de Classes
![Diagrama_de_Classe_CombustiveisBR](https://github.com/isaias30silva/combustiveisBR/assets/93226440/dd11b8e0-cdee-463d-b388-e7a40b863c52)

## Diagrama Entidade Relacionamento
![Diagrama_ER-Copy of Page-1](https://github.com/isaias30silva/combustiveisBR/assets/93226440/bd2e8dce-8472-4276-97cc-3298325b9104)
