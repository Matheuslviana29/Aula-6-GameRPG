import java.util.Random;

public class Galactus extends Inimigo {
    public Galactus() {
        super("Galactus", 1000, 60, new Esquiva(30));
    }

    @Override
    public void fazApresentacao() {
        System.out.println("Minha fome não tem limites. Seu mundo será consumido!");
    }

    @Override
    public void fraseMorte() {
        System.out.println("Como pode uma criatura tão pequena... me deter?");
    }

    @Override
    public void fazAtaque(Criatura alvo) {
        Random rd = new Random();
        if (rd.nextInt(100) < 20) {
            System.out.println("GALACTUS USA ENERGIA CÓSMICA! Dano massivo!");
            alvo.tomaDano(150);
        } else {
            super.fazAtaque(alvo);
        }
    }
}