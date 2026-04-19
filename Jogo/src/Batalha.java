public class Batalha {
    private String vencedor;

    public Criatura iniciar(Criatura jogador, Criatura inimigo) {
        System.out.println("\n--- INICIANDO CONFRONTO: " + jogador.getNome() + " VS " + inimigo.getNome() + " ---");
        jogador.fazApresentacao();
        inimigo.fazApresentacao();

        while (jogador.estarVivo() && inimigo.estarVivo()) {
            jogador.mostrarVida();
            inimigo.mostrarVida();

            jogador.fazAtaque(inimigo);
            if (inimigo.estarVivo()) {
                inimigo.fazAtaque(jogador);
            }
        }

        if (jogador.estarVivo()) {
            this.vencedor = jogador.getNome();
            return jogador;
        } else {
            this.vencedor = inimigo.getNome();
            return inimigo;
        }
    }

    public String getVencedor() {
        return vencedor;
    }
}