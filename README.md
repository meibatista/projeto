# Sistema de Olimpíadas de Questões

## Sobre o projeto

Este projeto é um sistema simples para cadastro de participantes, provas, questões e aplicação de provas.

O objetivo da atividade foi refatorar o código original aplicando os princípios do SOLID, sem alterar a lógica de funcionamento do sistema.

---

## Principais mudanças realizadas

- Organização da classe App, que antes concentrava toda a lógica do sistema
- Separação do código em métodos menores, deixando mais legível
- Criação de métodos auxiliares para evitar repetição de código
- Melhoria na organização da aplicação da prova
- Encapsulamento melhor da lista de respostas na classe Tentativa
- Adição de validações nas entidades (Participante, Prova e Questao)
- Uso de construtores para facilitar criação de objetos

---

## Princípios SOLID aplicados

### S - Single Responsibility Principle (SRP)

Antes, a classe App fazia muitas coisas ao mesmo tempo.

Agora:
- O código foi dividido em métodos menores
- Cada parte do sistema tem uma responsabilidade mais clara
- As entidades (Participante, Prova, Questao, etc.) cuidam apenas dos seus próprios dados

---

### O - Open/Closed Principle (OCP)

O código foi organizado de forma que novas funcionalidades possam ser adicionadas sem alterar o que já existe.

Exemplo:
- É possível adicionar novas funcionalidades no menu sem modificar toda a estrutura
- As classes estão preparadas para receber novas propriedades no futuro

---

### L - Liskov Substitution Principle (LSP)

As classes do sistema mantêm um comportamento consistente e podem ser utilizadas sem causar erros.

Mesmo não utilizando herança diretamente, o sistema respeita esse princípio ao manter consistência entre os objetos.

---

### I - Interface Segregation Principle (ISP)

O sistema foi mantido simples, evitando criação de métodos desnecessários nas classes.

Cada classe possui apenas o que realmente precisa, sem sobrecarga de responsabilidades.

---

### D - Dependency Inversion Principle (DIP)

O código foi organizado para reduzir dependências diretas entre partes do sistema.

Exemplo:
- A classe Tentativa possui um método próprio para adicionar respostas, evitando manipulação direta da lista
- A lógica foi distribuída em métodos, reduzindo acoplamento

---

## Observações

- Nenhuma regra de negócio foi alterada
- Nenhuma funcionalidade foi removida
- Não foram utilizados frameworks externos
- A refatoração foi feita apenas para melhorar organização e manutenção do código
