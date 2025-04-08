# 🏫 Exercício de Programação Orientada a Objetos (POO) em Java
## Sistema Escolar com Herança e ArrayList

### 🎯 Objetivo

Criar um sistema simples de cadastro de pessoas em uma escola, utilizando os conceitos de **herança** e **manipulação de `ArrayList`** em Java.

---

### 📋 Requisitos

1. Crie uma **classe base `Pessoa`** com os seguintes atributos:
    - `nome` (String)
    - `idade` (int)

2. Crie a classe **`Aluno`**, que herda de `Pessoa`, com o atributo adicional:
    - `matricula` (String)
    - Sobrescreva o método `exibirInformacoes()` para mostrar também a matrícula.

3. Crie a classe **`Professor`**, que também herda de `Pessoa`, com o atributo adicional:
    - `disciplina` (String)
    - Sobrescreva o método `exibirInformacoes()` para mostrar também a disciplina.

4. Crie a classe **`Escola`** que contenha:
    - Um atributo `ArrayList<Pessoa>` para armazenar alunos e professores.
    - Métodos:
        - `adicionarPessoa(Pessoa p)`
        - `listarPessoas()`: deve exibir os dados de todos os cadastrados.

5. No método `main`:
    - Crie instâncias de `Aluno` e `Professor`.
    - Adicione essas pessoas na `Escola`.
    - Liste todos utilizando o método `listarPessoas()`.

---

### 💡 Dica

Utilize **polimorfismo** e sobrescrita de métodos para garantir que o método correto `exibirInformacoes()` seja chamado para cada tipo de pessoa (aluno ou professor).

---

### ✅ O que será avaliado

- Uso correto de herança
- Manipulação de `ArrayList`
- Organização e estrutura do código
- Aplicação dos princípios de POO
