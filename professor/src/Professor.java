public class Professor {
    private String nome;
    private String titulacao;
    private int ch;

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome=nome;
    }

    public String getTitulacao(){
        return titulacao;
    }
    public void setTitulacao(String titulacao){
        this.titulacao=titulacao;
    }

    public int getCh(){
        return ch;
    }
    public void setCh(int ch){
        this.ch=ch;
    }

    public Professor(String nome, String titulacao, int ch){
        this.nome=nome;
        this.titulacao=titulacao;
        this.ch=ch;
    }

    public void imprimir(){
        System.out.println("Nome do professor: " + nome);
        System.out.println("Titulação: " + titulacao);
        System.out.println("Carga horária: " + ch);
        System.out.println("------------");
    }
}
