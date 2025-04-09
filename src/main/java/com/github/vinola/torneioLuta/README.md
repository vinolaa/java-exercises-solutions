# 🎮 Projeto Java: Sistema de Torneio de Luta

Crie um sistema em Java que simula um torneio entre personagens lutadores. O usuário poderá cadastrar personagens, listar os personagens cadastrados e simular lutas entre eles.

---

## ✅ Requisitos obrigatórios

### 1. Classe `Personagem`

- **Atributos:**
    - `nome` (String)
    - `forca` (int)
    - `vida` (int), que começa em 100

- **Métodos:**
    - `atacar(Personagem oponente)`: causa dano igual à força no oponente
    - `receberDano(int dano)`: diminui a vida do personagem
    - `estaVivo()`: retorna `true` se a vida for maior que 0

- **Construtores:**
    - Um com nome e força
    - Um sem parâmetros que define nome como `"Desconhecido"` e força `10`

- **Bloco de inicialização:**
    - Define `vida = 100`

---

### 2. Classe principal `Torneio`

- Deve usar `ArrayList` para guardar os personagens
- Menu com as opções:
    - `1. Cadastrar personagem` (com nome e força)
    - `2. Listar personagens`
    - `3. Simular luta entre dois personagens`
    - `0. Sair`

---

## 🔁 Luta

- A luta acontece em turnos:
    - Personagem 1 ataca
    - Se o outro ainda estiver vivo, ele ataca de volta
    - Repetir até um ou os dois serem derrotados
- Mostrar quem venceu ou se foi empate

---

## 💡 Extras (opcional)

- Permitir "reviver" personagens
- Mostrar ranking de vitórias
- Permitir resetar a vida entre lutas
- Usar `varargs` para criar vários personagens de uma vez
