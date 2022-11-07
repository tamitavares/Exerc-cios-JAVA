public class Mesa {
    private int num;
    private int pessoas;
    private Double conta;

    public int getNum(){
        return num;
    }

    public void setNum(int num){
        this.num=num;
    }

    public int getPessoas(){
        return pessoas;
    }

    public void setPessoas(int pessoas){
        this.pessoas=pessoas;
    }

    public Double getConta(){
        return conta;
    }

    public void setConta(Double conta){
        this.conta=conta;
    }

    public Mesa(){
        this.conta = 0.0;
    }

    public Mesa(int num, int pessoas, Double conta){
        this.num=num;
        this.pessoas=pessoas;
        this.conta=conta;
    }

    public void imprimir(){
        System.out.println("Mesa " + num + " com " + pessoas + " pessoas, total: " + conta + " reais");
    }

    public Double contaPorPessoa(){
        return conta/pessoas;
    }

    public void imprimirContaPorPessoa(){
        System.out.println("Conta por pessoa mesa " + num + ": " + contaPorPessoa() + " reais");
    }

}
