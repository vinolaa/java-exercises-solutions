# ⚔️ Desafios Extras - Projeto Torneio de Luta

Dê um upgrade no seu projeto com os desafios abaixo! Escolha os que quiser implementar e personalize do seu jeito.

---

## 🔝 Desafio 1: Ranking de Vitórias

Adicione um sistema de ranking com base nas vitórias dos personagens.

### ✅ Requisitos:
- Adicione um atributo `int vitorias` à classe `Personagem`
- Crie o método `getVitorias()`
- Sempre que um personagem vencer uma luta, incremente o contador de vitórias
- Adicione uma nova opção no menu: **"Exibir ranking de vitórias"**
- O ranking deve exibir os personagens em ordem decrescente de vitórias

---

## ♻️ Desafio 2: Reviver Personagens

Permita que o jogador reviva personagens derrotados (resetando a vida).

### ✅ Requisitos:
- Adicione o método `reviver()` à classe `Personagem` que define `vida = 100`
- Adicione uma nova opção no menu: **"Reviver personagem"**
- Liste todos os personagens para que o jogador escolha qual reviver
- Exiba uma mensagem confirmando que o personagem foi revivido

---

## 🧠 Desafio 3: Torneio Automático (Estilo Mata-Mata)

Implemente um sistema de torneio automático onde personagens lutam até restar apenas um campeão.

### ✅ Requisitos:
- Crie uma nova opção no menu: **"Iniciar torneio automático"**
- O sistema deve:
    - Sortear (ou pegar sequencialmente) dois personagens
    - Simular a luta
    - Remover o perdedor da lista
    - Continuar até sobrar apenas 1 personagem
- Ao final, exiba o nome do campeão e quantas lutas ele venceu

---

## 🔧 Desafio 4: Modo de Exibição Personalizado

Deixe a apresentação dos personagens mais estilosa e visual.

### ✅ Requisitos:
- Melhore o método `toString()` da classe `Personagem`
- Use emojis e símbolos para representar os atributos
- Exemplo de visual:

