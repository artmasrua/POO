public abstract class Pessoa {
    protected String nome;
    protected int idade;
    protected String genero;

    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public String getGenero() {
        return genero;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade() {
        this.idade = idade;
    }
    public void setGenero() {
        this.genero = genero;
    }
}
