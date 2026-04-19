public class Magneto extends Inimigo {
    public Magneto() {
        super("Magneto", 600, 95, new DefesaMista(25, 20));
    }

    @Override
    public void fazApresentacao() {
        System.out.println("A humanidade teve sua chance. Agora é a nossa vez.");
    }

    @Override
    public void fraseMorte() {
        System.out.println("Charles... eu falhei...");
    }
}