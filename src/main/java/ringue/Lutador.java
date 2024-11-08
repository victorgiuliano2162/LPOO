package ringue;

public class Lutador {

    String nome;
    int energia;
    int forca;

    Lutador() {
    }

    Lutador(String nome, int energia, int forca) {
        this.nome = nome;
        this.energia = energia;
        this.forca = forca;
    }

    public void bater(Lutador agressor, Lutador vitima) {
        if (agressor.energia > 0) {
            vitima.energia -= agressor.forca;

            status(agressor);
            status(vitima);

            if (vitima.energia <= 0) {
                morrer(vitima);
                vitima.energia = 0;
            }
        } else {
            System.out.println("Mermão, tu já viu morto bater?");
        }
    }

    public void status(Lutador l) {
        System.out.println(l.nome + "\n" + l.energia + "\n");
    }

    public void morrer(Lutador l) {
        System.out.println(l.nome + " morreu" + "\n" + l.nome + " = " + l.energia);
    }
}
