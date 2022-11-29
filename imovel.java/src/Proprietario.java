public class Proprietario
{
    private String nome;
    private int cpf;
    private int telefone;

    public Proprietario()
    {
        this.nome="";
        this.cpf=0;
        this.telefone=0;
    }

    public Proprietario(String nome, int cpf, int telefone)
    {
        this.nome=nome;
        this.cpf=cpf;
        this.telefone=telefone;
    }

    public String getNome()
    {
        return this.nome;
    }
    public void setNome(String nome)
    {
        this.nome=nome;
    }

    public int getCpf()
    {
        return this.cpf;
    }
    public void setCpf(int cpf)
    {
        this.cpf=cpf;
    }

    public int getTelefone()
    {
        return this.telefone;
    }
    public void setTelefone(int telefone)
    {
        this.telefone=telefone;
    }
}