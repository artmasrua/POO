public abstract class Empregado extends Pessoa {
    double salario;
    String matricula;

    public double getSalario() {
        return salario;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double valorInss(double salario) {
        return salario *= 0.11;
    }



}
