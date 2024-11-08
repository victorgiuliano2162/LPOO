package ringue;

public class Main {
    public static void main(String[] args) {
        Lutador Ryu = new Lutador("Ryu", 100, 35);
        Lutador Bison = new Lutador("Bison", 100, 12);

        Ryu.bater(Ryu, Bison);
        Ryu.bater(Ryu, Bison);
        Ryu.bater(Ryu, Bison);
        Bison.bater(Bison, Ryu);
        Bison.bater(Bison, Ryu);
        Bison.bater(Bison, Ryu);
        Bison.bater(Bison, Ryu);
        Bison.bater(Bison, Ryu);
        Bison.bater(Bison, Ryu);
        Bison.bater(Bison, Ryu);
        Bison.bater(Bison, Ryu);
        Bison.bater(Bison, Ryu);
    }
}
