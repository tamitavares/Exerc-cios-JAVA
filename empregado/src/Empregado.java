public class Empregado {
    private String nome;
    private Double salario;

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public Double getSalario(){
        return salario;
    }

    public void setSalario(Double salario){
        this.salario = salario;
    }

    public Empregado(String nome, Double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public Double calcularSalario(Double desconto){
        return (salario*(1+desconto));
    }

    public Empregado(){

    }

    public void imprimirNome(){
        System.out.println("O maior salário é do empregado "+ nome);
    }

}
