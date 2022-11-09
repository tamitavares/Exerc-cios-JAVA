//Empregado

public class Empregado {
    private String nome;
    private Double salario;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }
    public void setSalario(Double salario) {
        this.salario = salario;
    }
    
    public void verificaPositivo(){
        if(salario<0){
            salario= -1.0;
        }
    }

    public void calcularSalarioLiquido(){
        if(salario>1000.00){
            salario = salario*(1-0.275);
        }
        else{
            salario = salario*(1-0.1);
        }
    }
    
    public void imprimir(){
        System.out.println(nome + " - " + salario);
    }

    public Empregado(String nome, Double salario){
        this.nome=nome;
        this.salario=salario;
        verificaPositivo();
        calcularSalarioLiquido();
        imprimir();
    }


}
