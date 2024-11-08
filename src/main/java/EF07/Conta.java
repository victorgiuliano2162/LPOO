package EF07;

public class Conta {

    private int numero;
    private double saldo;

    Conta(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public void setSaldo(double saldo) {this.saldo = saldo;}
    public double getSaldo() {return saldo;}
    public void setNumero(int numero) {this.numero = numero;}
    public int getNumero() {return numero;}
    public void depositar(double valor) {this.saldo += valor;}

    public void sacar(double valor) {
        if (this.saldo > valor) {
            this.saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void calcularJurosMensais(double percentual) {
        double juros = getSaldo() * (percentual/100);
        this.setSaldo(juros + getSaldo());
    }


}

