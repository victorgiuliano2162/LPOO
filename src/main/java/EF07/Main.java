package EF07;

public class Main {
    public static void main(String[] args) {
        //Instaciei o objeto
        ContaPoupanca contaPoupanca = new ContaPoupanca(1, 10_000);
        ContaTesouroDireto contaTesouro = new ContaTesouroDireto(1, 10_000);

        //Imprimi o saldo
        contaPoupanca.imprimirSaldo();
        contaTesouro.imprimirSaldo();

        //Deposito de 500 em ambas as contas
        contaPoupanca.depositar(500);
        contaTesouro.depositar(500);

        //Imprimi o saldo
        contaPoupanca.imprimirSaldo();
        contaTesouro.imprimirSaldo();

        //Aplicar os juros
        contaPoupanca.calcularJurosMensais();
        contaTesouro.calcularJurosMensais();

        //Imprimi o saldo
        contaPoupanca.imprimirSaldo();
        contaTesouro.imprimirSaldo();
    }
}
