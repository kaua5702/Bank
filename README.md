# 🏦 Projeto Bank

Este projeto é uma simulação de operações bancárias em Java, permitindo criar contas, realizar depósitos e saques, e acompanhar o saldo com registros de log.

## 📂 Estrutura do Projeto

- `App.java`: Classe principal que executa o programa e demonstra as operações.
- `Account.java`: Classe que representa uma conta bancária, com métodos para depósito, saque e exibição de informações.
- `Log.java`: Classe auxiliar responsável por registrar e exibir mensagens de log.

## 🚀 Funcionalidades

- Criar uma conta bancária com agência, número e titular.
- Limitar o nome do titular a 12 caracteres.
- Realizar depósitos com atualização de saldo e registro em log.
- Efetuar saques com verificação de saldo e registro em log.
- Exibir informações completas da conta.


## 📌 Exemplo de Saída

LOG: SAQUE - R$ 200.0 Seu saldo atual é de R$ 0.0

LOG: DEPOSITO - R$ 100.0 Sua conta agora é de R$ 100.0

LOG: DEPOSITO - R$ 50.0 Sua conta agora é de R$ 150.0

LOG: DEPOSITO - R$ 100.0 Sua conta agora é de R$ 250.0

LOG: SAQUE - R$ 200.0 Sua conta agora é de R$ 50.0

LOG: SAQUE - R$ 200.0 Seu saldo atual é de R$ 50.0

A conta Seu Barriga 001 / 1234 possui: R$ 50.0


## 🛠️ Tecnologias Utilizadas
- Java 17+ (ou versão compatível)
- Paradigma de Programação Orientada a Objetos (POO)
