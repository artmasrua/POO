public abstract class ContaBancaria {
    protected String numConta;
    protected double saldo;
    abstract double sacar(double valor);
    abstract void depositar(double valor);
}
