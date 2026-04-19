public class Thanos extends Inimigo {
    public Thanos() {
        super("Thanos", 700, 85, new Escudo(25));
    }

    @Override
    public void fazApresentacao() {
        System.out.println("Eu sou inevitável!");
    }

    @Override
    public void fraseMorte() {
        System.out.println("Eu... sou... nada...");
    }
}