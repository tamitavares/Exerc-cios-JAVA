public class App {
    public static void main(String[] args) throws Exception {
        Funcionario f = new Funcionario("Carlos", 1000);
        f.aumentarSalario(10);
        f.imprimir();

        Gerente g = new Gerente("Roberto", 1000, "Douglas");
        g.imprimir();
        g.aumentarSalario(10);
        g.imprimir();
    }
}
