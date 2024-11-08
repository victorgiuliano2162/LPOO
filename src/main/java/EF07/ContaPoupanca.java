package EF07;

public class ContaPoupanca extends Conta{

    ContaPoupanca(int numero, double saldo) {
        super(numero, saldo);
    }


    public void calcularJurosMensais() {
        double juros = getSaldo() * 0.005;
        this.setSaldo(juros + getSaldo());
    }
}
