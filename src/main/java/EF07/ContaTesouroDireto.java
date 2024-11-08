package EF07;

public class ContaTesouroDireto extends Conta {

    ContaTesouroDireto(int numero, double saldo) {
        super(numero, saldo);
    }

    @Override
    public void depositar(double valor) {
        if (valor > 1000) {
            double saldo = getSaldo() + valor;
            setSaldo(saldo);
        } else {
            System.out.println("Valor insuficiente, mamão");
        }
    }

    public void calcularJurosMensais() {
        double juros = getSaldo() * 0.005;
        this.setSaldo(juros + getSaldo());
    }
}
