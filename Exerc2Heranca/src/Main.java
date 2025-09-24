public class Main {
    public static void main(String[] args) {
        Gerente g = new Gerente();
        g.nome = "Geppeto";
        g.idade = 58;
        g.matricula = "x";
        g.salario = 1200;
        g.nomeGerencia = "Pinoquio";
        System.out.println(g);

        Vendedor v = new Vendedor();
        v.nome = "Arthur";
        v.salario = 1200;
        v.valorVendas = 50;
        v.quantVendas = 8;
        System.out.println(v);

        Cliente c = new Cliente();
        c.nome = "Clovis";
        c.idade = 38;
        c.genero = "Masculino";
        c.valorDivida = 2000;
        c.anoNascim = 1987;
        System.out.println(c);
    }
}
