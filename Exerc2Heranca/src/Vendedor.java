public class Vendedor extends Empregado{

    double valorVendas;
    int quantVendas;

    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public int getQuantVendas() {
        return quantVendas;
    }

    public void setQuantVendas(int quantVendas) {
        this.quantVendas = quantVendas;
    }

    @Override
    public String toString() {
        return "Vendedor: " +
                "nome:'" + nome +
                ", salario: " + salario +
                ", valorVendas: " + valorVendas +
                ", quantVendas: " + quantVendas;
    }
}