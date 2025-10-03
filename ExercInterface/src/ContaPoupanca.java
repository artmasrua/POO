public class ContaPoupanca extends ContaBancaria implements Imprimivel{
    int limite;

    @Override
    double sacar(double valor) {
        return 0;
    }

    @Override
    void depositar(double valor) {

    }

    public void mostrarDados() {
        System.out.println(
                "Tipo de Conta: Conta Poupanca"+
                "Numero da conta: "+numConta+
                        ", Saldo: "+saldo+
                        ", Limite: "+limite);
    }

}