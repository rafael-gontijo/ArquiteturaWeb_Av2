# **To-Do List RESTful API - Trabalho Final de Arquitetura de Programação Web**

---

## **Descrição do Projeto**
Este projeto consiste em uma aplicação web RESTful para gerenciamento de tarefas, implementada como parte da avaliação final da disciplina de **Arquitetura de Programação Web**. A aplicação utiliza **Spring Boot**, **MySQL**, e autenticação/autorização com **JWT**.

---

## **Requisitos Técnicos**

### **Linguagem e Ferramentas**
- **Framework**: Spring Boot 3.x.
- **Banco de Dados**: MySQL.
- **Autenticação e Autorização**: Spring Security 6 com JWT.
- **Documentação**: Swagger e JavaDoc.
- **Monitoramento**: Spring Boot Actuator, Prometheus, Grafana.
- 
### **Dependências Principais**
- **Spring Web**: Para construção de APIs RESTful.
- **Spring Boot Actuator**: Para monitoramento.
- **Lombok**: Para simplificação de código.
- **MySQL Driver**: Para conexão com o banco de dados.
- **Spring Boot DevTools**: Para agilidade no desenvolvimento.

---

## **Funcionalidades da API**

### **Autenticação**
- Registro e login de usuários.
- Geração e validação de tokens JWT.

### **Gerenciamento de Tarefas**
- Endpoints para:
  - Criar tarefas.
  - Listar tarefas.
  - Excluir tarefas.
- Controle de acesso baseado em autenticação.

### **Segurança**
- Armazenamento seguro de senhas com `BCryptPasswordEncoder`.
- Tokens JWT para autenticação e autorização.

## Testes

### Testes de Carga com JMeter
Relatórios e arquivos de configuração estão disponíveis na pasta:
`/Testes JMeter`

### Testes Unitários **[Em Desenvolvimento]**
Implementados com JUnit e Mockito.

## Monitoramento **[Em Desenvolvimento]**
O monitoramento da aplicação foi realizado utilizando:
- Spring Boot Actuator: Para métricas básicas.
- Prometheus: Para coleta de métricas.
- Grafana: Para visualização.

Os relatórios e prints estão disponíveis na pasta:
`/Monitoramento`

## Documentação

### Swagger **[Em Desenvolvimento]**
A documentação da API pode ser acessada pelo link:
[**Documentação Swagger(Localhost)**](http://localhost:8080/swagger-ui/index.html)

### JavaDoc **[Em Desenvolvimento]**
A documentação Java gerada está disponível no repositório.

## Hospedagem **[Em Desenvolvimento]**
A aplicação está hospedada na plataforma Render.
Acesse a aplicação no seguinte link:
**Aplicação no Render**


---

## **Configuração do Projeto**

### **1. Pré-requisitos**
- **Java**: Versão 17 ou superior.
- **Maven**: Versão 3.8 ou superior.
- **MySQL**: Versão 8.0 ou superior.

### **2. Configuração de Variáveis de Ambiente**
Antes de executar a aplicação, configure as seguintes variáveis no ambiente:
- **`DB_URL`**: URL de conexão do banco de dados.
- **`DB_USERNAME`**: Usuário do banco de dados.
- **`DB_PASSWORD`**: Senha do banco de dados.
- **`JWT_SECRET`**: Chave secreta para geração de tokens JWT.

# Instruções de Execução do Projeto

### **1. Pré-requisitos**
Antes de executar a aplicação, certifique-se de ter as seguintes ferramentas instaladas:

- [JDK 17+](https://adoptium.net/) para executar o Spring Boot.
- [Maven](https://maven.apache.org/) para gerenciar dependências e construir o projeto.
- [XAMPP](https://www.apachefriends.org/index.html) para rodar o MySQL e Apache.

### **2. Preparando o Ambiente**

1. **Iniciar o XAMPP**:
   - Abra o **XAMPP** e inicie os módulos **Apache** e **MySQL** no painel de controle do XAMPP.

2. **Criar o banco de dados no MySQL**:
   - Acesse o **phpMyAdmin** via navegador em `http://localhost/phpmyadmin`.
   - No **phpMyAdmin**, crie um banco de dados chamado `provaav2`.

