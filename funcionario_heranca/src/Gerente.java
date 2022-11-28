public class Gerente extends Funcionario {
    private String assistente;

    public String getAssistente(){
        return assistente;
    }
    public void setAssistente(String assistente){
        this.assistente=assistente;
    }
    
    public Gerente(String nome, double salario, String assistente){
        super(nome,salario);
        this.assistente=assistente;
    }

    public void imprimir() {
        System.out.println("Nome: " + getNome());
        System.out.println("Assistente: " + assistente);
        System.out.println("Salário: " + getSalario());
    }

    public void aumentarSalario(double percAumento){
        double aumento = getSalario()* (percAumento/100.0);
        double aumentoGer = aumento + (aumento * 20/100.0);
        double novoSalario = getSalario() + aumentoGer;
        setSalario(novoSalario);
    }

}
