public class Cliente extends Pessoa {

    double valorDivida;
    int anoNascim;

    public String toString() {
        return "Nome: "+nome+", idade: "+idade+
                " anos, genero: "+genero+
                ", valor da divida: "+valorDivida+
                ", ano de nascimento"+anoNascim;
    }
}
