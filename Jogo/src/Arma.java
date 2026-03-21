import java.util.Random;

public abstract class Arma {
    private int ataque;
    private int chance;
    private String nome;

    public Arma(String nome,int chance, int dano) {
        this.nome = nome;
        this.chance = chance;
        this.ataque = ataque;
    }

    public void descricao(){
        System.out.println(this.nome + "Nome da arma: " + this.ataque + " - dano " + this.chance + "%");

    }

    public void golpe(Criatura alvo){
        Random rd = new Random();
        int sorteio = rd.nextInt(100);

        if(sorteio < this.chance){
            alvo.tomaDano((this.ataque));
        }else{
            System.out.println("Ataque falhou.");
        }
        }
    }
