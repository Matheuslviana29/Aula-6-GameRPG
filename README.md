# ⚔️ Mini RPG em Java

Este é um mini-jogo de RPG em texto no terminal que desenvolvi durante minhas aulas de **Programação Orientada a Objetos (POO)**.

##  Como funciona o jogo?

Logo no início, você cria o seu herói (escolhendo um nome) e seleciona o seu arsenal de combate:
- **Arma Curta:** Espada ou Faca
- **Arma Longa:** Arco e Flecha ou Pistola

Após se equipar, o seu herói entra em uma batalha contra os vilões: **Thanos, Magneto e Galactus**.

- Se você **vencer** um inimigo, sua vida é totalmente restaurada e você avança para o próximo desafio.
- Se for **derrotado**, fim de jogo!
- Ao final, o sistema exibe um relatório resumindo o resultado de cada batalha.

##  Conceitos de POO Aplicados

Foram aplicados os seguintes conceitos:
- **Herança:** Criação de uma estrutura onde `Jogador` e os vilões (como `Thanos`) herdam atributos e métodos de uma classe base (`Criatura`).
- **Polimorfismo:** Implementação de diferentes tipos de ataques e defesas (`Arma`, `Espada`, `Escudo`, etc.), onde cada item tem um comportamento específico, mas segue o mesmo "molde".
- **Encapsulamento:** Proteção da integridade dos dados dos personagens (como pontos de vida), controlando o acesso através de métodos.

##  Como rodar o projeto localmente

Para você testar:

1. Clone este repositório:
   ```bash
   git clone https://github.com/Matheuslviana29/Aula-6-GameRPG.git
   ```
2. Abra o projeto na sua IDE Java favorita (como IntelliJ IDEA, Eclipse ou VS Code).
3. Localize e execute o arquivo principal: `Jogo/src/Main.java`.
4. Siga as instruções no console do terminal, faça suas escolhas e boa sorte nas batalhas!
