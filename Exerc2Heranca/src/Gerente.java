public class Gerente extends Empregado{

    String nomeGerencia;

    public String getNomeGerencia() {
        return nomeGerencia;
    }

    public void setNomeGerencia(String nomeGerencia) {
        this.nomeGerencia = nomeGerencia;
    }

    @Override
    public String toString() {
        return "Gerente: " +
                "nome: " + nome +
                ", idade: " + idade +
                ", matricula: " + matricula +
                ", nomeGerencia: " + nomeGerencia +
                ", valor INSS: "+ valorInss(salario);
    }
}