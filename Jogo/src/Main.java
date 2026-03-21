public class Main {
    public static void main(String[] args) {

        Criatura Jogador = new Jogador("Matheus");
        Criatura inimigo = new Demonion();

        System.out.println("#############");
        System.out.println("A grande batalha");
        System.out.println("#############");

        Jogador.fazApresentacao();
        inimigo.fazApresentacao();

        int cont = 0;
        while(true){
            cont++;
            System.out.println("Rodada" + cont);

            Jogador.mostrarVida();
            inimigo.mostrarVida();
            Jogador.fazAtaque(inimigo);
            if(inimigo.estarVivo()){
                inimigo.fazAtaque(Jogador);
            }
            if(!Jogador.estarVivo()){
                Jogador.fraseMorte();
                System.out.println(inimigo.getNome() + " venceu!");
                break;
            } else if (!inimigo.estarVivo()) {
                inimigo.fraseMorte();
                System.out.println(Jogador.getNome() + " venceu!");
                break;

            }

        }
    }
}
