public class Funcionario {
    private String nome;
    private double salario;

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome=nome;
    }

    public double getSalario(){
        return salario;
    }
    public void setSalario(double salario){
        if(salario>0){
            this.salario=salario;
        }else{
            this.salario=0;
        }
    }

    public Funcionario(){
        this.nome="";
        this.salario=0;
    }

    public Funcionario(String nome, double salario){
        this.nome=nome;
        setSalario(salario);
    }

    public void imprimir(){
        System.out.println("Nome: " + nome);
        System.out.println("Salário: " + salario);
    }

    public void aumentarSalario(double percAumento){
        double aumento = salario*(percAumento/100.0);
        salario = salario+aumento;
    }


}
