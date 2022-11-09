//Mesa

public class Mesa {
    private int num;
    private int pessoas;
    private Double conta;

    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }

    public int getPessoas() {
        return pessoas;
    }
    public void setPessoas(int pessoas) {
        this.pessoas = pessoas;
    }

    public Double getConta() {
        return conta;
    }
    public void setConta(Double conta) {
        this.conta = conta;
    }

    public Mesa(int num, int pessoas, Double conta){
        this.num=num;
        this.pessoas=pessoas;
        this.conta=0.0;
    }

    public Double totalPedido(Double valor, Double qtde){
        return (valor*qtde);
    }

    public void efetuarPedido(int cod, Double qtde){
        if(cod==1){
            conta +=totalPedido(2.00, qtde);
        }
        else if(cod==2){
            conta+=totalPedido(5.00, qtde);
        }
        else if(cod==3){
            conta+=totalPedido(4.00, qtde);
        }
    }

   
    public void fecharConta(int formaPagamento){
        if(formaPagamento==1){
            conta=(conta*0.9);
        }
        else if(formaPagamento==3){
            conta=(conta*0.95);
        }
    }

    public Double contaPorPessoa(){
        Double totalPessoa=(conta/pessoas);
        Double diferenca=0.0;
        if(totalPessoa>50.00){
            diferenca = totalPessoa-50.00;
            totalPessoa = 50+(diferenca/pessoas);
        }
        return totalPessoa;
    }

    public void imprimir(){
        System.out.println("Nº " + num + " | Quantidade de pessoas: " + pessoas + " | Conta: R$" + conta);
    }

    public void imprimirContaPorPessoa(int num){
        Double totalPessoa;
        fecharConta(num);
        System.out.println("Conta total da mesa " + num + ": " + conta);
        totalPessoa = contaPorPessoa();
        System.out.println("Total por pessoa: " + totalPessoa);
    }


}
