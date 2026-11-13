# 🏦 Sistema de Conta Bancária (Java - POO)

## 📌 Visão Geral
Aplicação desenvolvida em Java para simular operações bancárias essenciais (depósito, saque e consulta de saldo), aplicando os pilares da **Programação Orientada a Objetos (POO)**, encapsulamento de atributos, métodos construtores com `this` e tratamento de erros por códigos de retorno.

## 🚀 Funcionalidades e Regras de Negócio

- **Encapsulamento:** Atributos protegidos (`private`) gerenciados de forma segura por meio de métodos getters (`getTitular()` e `getSaldo()`).
- **Construtor com `this`:** Inicialização da conta definindo diretamente o nome do titular.
- **Depósito Validado:** Método `depositar` que verifica se o valor informado é estritamente maior que zero antes de atualizar o saldo.
- **Saque com Códigos de Erro:** Método `sacar` estruturado para retornar códigos de controle de fluxo:
  - Retorna **`-2`**: Valor de saque inválido (menor ou igual a zero).
  - Retorna **`-1`**: Tentativa de saque com saldo insuficiente.
  - Retorna o **saldo atualizado**: Caso a operação seja realizada com sucesso.
- **Menu Interativo via Terminal:** Laço de repetição (`while`) combinado com seleção múltipla (`switch`) para navegação contínua entre depósito, saque, consulta de saldo e saída.

## 🛠️ Tecnologias Utilizadas
- **Linguagem:** Java
- **Conceitos Aplicados:** Programação Orientada a Objetos (POO), Encapsulamento, Construtores, Métodos com Retorno, Estruturas de Condição e Repetição.
