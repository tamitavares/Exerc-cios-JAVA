public class Animal {
    private String nome;
    private String raca;
    private String cor;
    private int anoNascimento;

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome=nome;
    }

    public String getRaca(){
        return raca;
    }
    public void setRaca(String raca){
        this.raca=raca;
    }

    public String getCor(){
        return cor;
    }
    public void setCor(String cor){
        this.cor=cor;
    }

    public int getanoNascimento(){
        return anoNascimento;
    }
    public void setanoNascimento(int anoNascimento){
        this.anoNascimento=anoNascimento;
    }
   

    public Animal(String nome, String raca, String cor, int anoNascimento){
        this.nome=nome;
        this.raca=raca;
        this.cor=cor;
        this.anoNascimento=anoNascimento;
    }

    public Animal(){

    }

    public void imprimir(){
        System.out.println("Nome do animal: "+ nome);
        System.out.println("Raça: "+ raca);
        System.out.println("Cor: "+ cor);
        System.out.println("Ano de Nascimento: "+ anoNascimento);
    }




}
