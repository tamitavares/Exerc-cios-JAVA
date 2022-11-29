public class Imovel{
    private String proprietario;
    private String endereco;
    private double valorMercado;
    private boolean status;

    public Imovel()
    {
        this.proprietario="";
        this.endereco="";
        this.valorMercado=0.0;
        status=false;
    }

    public Imovel(String proprietario, String endereco, double valorMercado, boolean status)
    {
        this.proprietario=proprietario;
        this.endereco=endereco;
        this.valorMercado=valorMercado;
        this.status=status;
    }

    public String getProprietario()
    {
        return this.proprietario;
    }
    public void setProprietario(String proprietario)
    {
        this.proprietario=proprietario;
    }

    public String getEndereco()
    {
        return this.endereco;
    }
    public void setEndereco(String endereco)
    {
        this.endereco=endereco;
    }

    public double getValorMercado()
    {
        return this.valorMercado;
    }
    public void setValorMercado(double valorMercado)
    {
        this.valorMercado=valorMercado;
    }

    public boolean getStatus()
    {
        return this.status;
    }
    public void setStatus(boolean status)
    {
        this.status=status;
    }

    public double calcularAlugel()
    {
        return (this.valorMercado*0.03);
    }

}