import java.util.Scanner;

public class Jogador extends Criatura{

    private Arma[]  armas = {
            new Faca(),
            new Pistola(),
            new Espada(),
            new ArcoEFlecha()
    };

    public Jogador(String nome) {
        super(nome, 900);
    }

    @Override
    public void fazAtaque(Criatura alvo) {
        Scanner sc = new Scanner((System.in));
        System.out.println("=== Escolha sua arma: ===");

        for(Arma arma : armas){
            int n = 0;
            n++;
            System.out.print(n + ") ");
            arma.descricao();

        int escolha = sc.nextInt();

        while(escolha < 1 || escolha > n ){
            System.out.println("Número inválido, escolha outro:");
            escolha = sc.nextInt();
        }

        armas [n-1].golpe(alvo);
        }

    }

    @Override
    public void fazApresentacao() {
        System.out.println("Vou chegar amassando vc MALIGNUS !!!");
    }

    @Override
    public void fraseMorte() {
        System.out.println("Deu sorte desta vez ");
    }
}
