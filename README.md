# 🛠️ Projeto: Sistema de Gerenciamento de Clientes

Este projeto é uma implementação básica de um sistema de gerenciamento de clientes, usando Java com uma estrutura DAO para lidar com operações CRUD (Criar, Ler, Atualizar e Excluir) para clientes. Além disso, possui um serviço de teste para verificar as funcionalidades do sistema.

## 📦 Pacotes

- **`br.com.mchaves.dao`**: Contém classes e interfaces para manipulação dos dados de clientes.
  - `ClienteDAO` e `IClienteDAO`: Implementações para salvar, buscar, excluir e alterar clientes.
  
- **`br.com.mchaves.domain`**: Contém a entidade Cliente, com propriedades como nome, CPF, telefone, endereço, cidade, estado, etc.

- **`br.com.mchaves.services`**: Fornece a camada de serviço que conecta o DAO com a lógica de negócio.
  - `ClienteService` e `IClienteService`: Para executar operações de cliente, utilizando a DAO.

## 🧪 Testes

- **`ClienteDAOTest`**: Testa a DAO utilizando o mock `ClienteDaoMock`.
- **`ClientServiceTest`**: Verifica as operações do serviço de clientes.

## 🛠️ Configurações

A aplicação utiliza Maven para gerenciamento de dependências e build. O arquivo `pom.xml` está configurado com JUnit para testes unitários.


## 🚀 Como Executar

Clone o repositório e use Maven para compilar e rodar o projeto:

```bash
mvn clean install
mvn test

