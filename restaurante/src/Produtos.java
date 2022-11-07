public class Produtos {
    private int cod;
    private String produto;
    private Double valor;

    public int getCod() {
        return cod;
    }
    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getProduto() {
        return produto;
    }
    public void setProduto(String produto) {
        this.produto = produto;
    }

    public Double getValor() {
        return valor;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Double soma(double qtde){
        return (valor*qtde);
    }

    public Produtos(int cod, String produto, Double valor){
        this.cod=cod;
        this.produto=produto;
        this.valor=valor;
    }

    public void imprimirProdutos(){
        System.out.println("Cod: " + cod + " | Produto: " + produto + " | Valor: R$" + valor);
    }

}
