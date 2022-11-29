public class Disciplina {
    private String nome;
    private int ch;
    private Professor p;

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome=nome;
    }

    public int getCh(){
        return ch;
    }
    public void setCh(int ch){
        this.ch=ch;
    }

    public Professor getP(){
        return p;
    }
    public void setP(Professor p){
        this.p=p;
    }

    public Disciplina(String nome, int ch, Professor p){
        this.nome=nome;
        this.ch=ch;
        this.p=p;
    }

    public void imprimir(){
        System.out.println("------------");
        System.out.println("Nome da disciplina: " + nome);
        System.out.println("Carga horária: " + ch);
        p.imprimir();
    }

}
