import java.util.Scanner;

public class Jogador extends Criatura {
    private Arma[] armas;

    public Jogador(String nome, Arma armaCurta, Arma armaLonga) {
        super(nome, 900);
        this.armas = new Arma[]{armaCurta, armaLonga};
    }

    @Override
    public void fazAtaque(Criatura alvo) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Escolha sua arma: ===");

        for (int i = 0; i < armas.length; i++) {
            System.out.print((i + 1) + ") ");
            armas[i].descricao();
        }

        int escolha = sc.nextInt();

        while (escolha < 1 || escolha > armas.length) {
            System.out.println("Número inválido, escolha outro:");
            escolha = sc.nextInt();
        }

        armas[escolha - 1].golpe(alvo);
    }

    @Override public void fazApresentacao() { System.out.println("Vou chegar amassando!!!"); }
    @Override public void fraseMorte() { System.out.println("Deu sorte desta vez..."); }
}