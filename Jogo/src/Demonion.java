public class Demonion extends Inimigo{

    public Demonion() {
        super("Demonion", 500, 120, new Escudo(15));
    }

    @Override
    public void fazApresentacao() {
        System.out.println("VIM PARA ACABAR COM A HUMINDADE");
    }

    @Override
    public void fraseMorte() {
        System.out.println("FUI PRA VALA !!!!!!!");
    }
}
