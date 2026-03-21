public class Malignus  extends Inimigo{

    public Malignus() {
        super("Malignus", 1000, 50);
    }


    @Override
    public void fazApresentacao() {
        System.out.println("Sou o Vilao Malignus !!! HAHAHAHA");

    }

    @Override
    public void fraseMorte() {
        System.out.println("Esse é o meu fim, NOOOOOOOOOOO");

    }



}
