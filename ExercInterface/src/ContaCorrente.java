import java.sql.SQLOutput;

public class ContaCorrente extends ContaBancaria implements Imprimivel{
    private double taxaDeOperecao;

    @Override
    public double sacar(double valor) {
        if (valor <= saldo) {
            saldo -= (valor - (valor * taxaDeOperecao));
            return valor;
        } else {
            System.out.println("Saldo issuficiente");
            return 0;
        }
    }
    @Override
    public void depositar(double valor) {
        saldo += (valor - (valor * taxaDeOperecao));
    }

    public void mostrarDados(){
        System.out.println(
                "Tipo de conta: Conta Corrente"+
                "Numero da conta: "+numConta+
                ", Saldo: "+saldo+
                ", Taxa de Operação: "+taxaDeOperecao);
    }

}
