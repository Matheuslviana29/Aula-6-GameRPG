import java.util.Random;

public abstract class Arma {
    private int ataque;
    private int chance;
    private String nome;
    private int municao;

    public Arma(String nome, int chance, int dano, int municao) {
        this.nome = nome;
        this.chance = chance;
        this.ataque = dano;
        this.municao = municao;
    }

    public void descricao() {
        String infoMunicao = (this.municao == -1) ? "Infinita" : String.valueOf(this.municao);
        System.out.println(this.nome + " - Dano: " + this.ataque + " - Chance: " + this.chance + "% - Munição: " + infoMunicao);
    }

    public void golpe(Criatura alvo) {
        if (this.municao == 0) {
            System.out.println("A arma " + this.nome + " está sem munição! Dano foi 0.");
            alvo.tomaDano(0);
            return;
        }

        if (this.municao > 0) {
            this.municao--;
        }

        Random rd = new Random();
        int sorteio = rd.nextInt(100);

        if (sorteio < this.chance) {
            alvo.tomaDano(this.ataque);
        } else {
            System.out.println("O ataque falhou.");
        }
    }
}