import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome de herói: ");
        String nome = sc.nextLine();

        System.out.println("Escolha sua arma curta: 1-Espada / 2-Faca");
        Arma curta = (sc.nextInt() == 1) ? new Espada() : new Faca();

        System.out.println("Escolha sua arma longa: 1-Arco / 2-Pistola");
        Arma longa = (sc.nextInt() == 1) ? new ArcoEFlecha() : new Pistola();

        Jogador jogador = new Jogador(nome, curta, longa);

        Inimigo[] inimigos = { new Thanos(), new Magneto(), new Galactus() };
        ArrayList<String> historico = new ArrayList<>();

        for (int i = 0; i < inimigos.length; i++) {
            Batalha luta = new Batalha();
            Criatura vencedor = luta.iniciar(jogador, inimigos[i]);

            historico.add("Batalha " + (i+1) + " (" + inimigos[i].getNome() + "): Vencedor = " + luta.getVencedor());

            if (vencedor == jogador) {
                System.out.println("Você venceu " + inimigos[i].getNome() + "! Vida restaurada.");
                jogador.restaurarVida();
            } else {
                System.out.println("Você foi derrotado por " + inimigos[i].getNome() + "...");
                break;
            }
        }

        System.out.println("\n=== RESUMO DAS BATALHAS ===");
        for (String registro : historico) {
            System.out.println(registro);
        }
    }
}