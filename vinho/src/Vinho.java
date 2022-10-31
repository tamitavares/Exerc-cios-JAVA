public class Vinho {
    private String nome;
    private String tipo;
    private int dia;
    private int mes; 
    private int ano;
    private Double preco;

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getTipo(){
        return tipo;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public int getDia(){
        return dia;
    }
    public void setDia(int dia){
        this.dia = dia;
    }

    public int getMes(){
        return mes;
    }
    public void setMes(int mes){
        this.mes = mes;
    }

    public int getAno(){
        return ano;
    }
    public void setAno(int ano){
        this.ano = ano;
    }

    public Double getPreco(){
        return preco;
    }
    public void setPreco(Double preco){
        this.preco = preco;
    }

    public Vinho(String nome, String tipo, int dia, int mes, int ano, Double preco){
        this.nome = nome;
        this.tipo = tipo;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.preco = preco;
    }

    //funcoes

    public void imprimirCaro(){
        System.out.println("Vinho mais caro: " + nome);
    }

    public void imprimirVelho(){
        System.out.println("Vinho mais velho: " + nome);
    }

    public int tempoTotal(){
        return (ano*12*30)-(12-(mes*30))-(30-dia);
    }

}
