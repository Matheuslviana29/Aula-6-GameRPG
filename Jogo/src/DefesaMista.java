import java.util.Random;

public class DefesaMista extends Defesa {
    private int chanceEsquiva;
    private int reducaoEscudo;

    public DefesaMista(int chanceEsquiva, int reducaoEscudo) {
        this.chanceEsquiva = chanceEsquiva;
        this.reducaoEscudo = reducaoEscudo;
    }

    @Override
    public int danoReduzido(int danoOriginal) {
        Random rd = new Random();
        if (rd.nextInt(100) < this.chanceEsquiva) {
            System.out.println("DEFESA MISTA: O ataque foi repelido magneticamente!");
            return 0;
        }
        return Math.max(danoOriginal - this.reducaoEscudo, 0);
    }
}