# Projeto dianome
API para gerenciamento da entidade Entregador

## Instruções para colocar em operação

# Requisitos

- Java 17
- PostgreSQL
  - Database: dianome
  - Username: postgres
  - Password: 12345

# Instalação

- Clone este projeto
- Importe para o eclipse
- Atualize as bibliotecas com o Maven
- Inicialize

# Acesso

- Abra um gerenciador de API, como o Postman

# Utilização

Para incluir um entregador

- URI: http://localhost:8080/entregadores
- Método: POST
- Formulário JSON: nome, cpf, capacidade

Para listar todos os entregadores

- URI: http://localhost:8080/entregadoes
- Método: GET

Para mostrar apenas um entregador

- URI: http://localhost:8080/entregadores/{id}
- Método: GET

Para alterar um entregador

- URI: http://localhost:8080/entregadores/{id}
- Método: PUT
- Formulário JSON: nome, cpf, capacidade

Para excluir um entregador

- URI: http://localhost:8080/entregadores/{id}
- Método: DELETE
