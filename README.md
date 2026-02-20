# Projeto Banco em Java

Este projeto simula um sistema bancário simples, permitindo a criação de contas, inserção de clientes e operações básicas como depósito e saque.  
O sistema roda via terminal e registra todas as operações realizadas.

## Estrutura do Projeto

- **Bank.java**  
  Classe responsável por gerenciar as contas de uma agência bancária.  
  - Armazena a lista de contas.  
  - Gera novas contas automaticamente com número sequencial.  
  - Calcula o saldo total do banco.  

- **App.java**  
  Classe principal que executa o programa.  
  - Interage com o usuário via terminal.  
  - Permite criar contas.  
  - Oferece operações de depósito e saque.  
  - Exibe todas as contas criadas e o saldo total do banco.  

- **Account.java**  
  Classe que representa uma conta bancária.  
  - Possui atributos de agência, número da conta, nome do titular e saldo.  
  - Limita o nome do titular a 12 caracteres.  
  - Permite depósitos e saques, com validação de saldo.  
  - Registra operações utilizando a classe `Log`.  
  - Sobrescreve `toString()` para exibir informações da conta.  

- **Log.java**  
  Classe simples de log.  
  - Exibe mensagens no console prefixadas com `"LOG:"`.  
  - Usada para registrar operações de depósito e saque.  

## Funcionalidades

- Criar uma agência bancária.  
- Inserir contas em uma agência.  
- Gerar contas automaticamente com número sequencial.  
- Realizar depósitos e saques.  
- Calcular e exibir o saldo total do banco.  
- Registrar operações realizadas em cada conta.


## Exemplo de Uso
O que deseja fazer? C=Criar conta, E=Sair do programa

C

Digite o seu nome:

Maria

O que deseja fazer? D=Deposito, S=Saque, E=Sair da Conta

D

Qual valor deseja depositar?

200

LOG: DEPOSITO - R$ 200.0 Sua conta agora é de R$ 200.0


## Melhorias Futuras
- Implementar transferências entre contas.
- Persistir dados em arquivos ou banco de dados.
- Criar interface gráfica para facilitar o uso.
- Adicionar autenticação de usuários.
