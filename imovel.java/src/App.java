import java.util.ArrayList;
public class App
{
    public static void main(String[] args)
    {
        ArrayList <Imovel> ImovelArray = new ArrayList<Imovel>();
        Imovel ImovelInfo;
        ArrayList <Proprietario> ProprietarioArray = new ArrayList<Proprietario>();
        Proprietario ProprietarioInfo;
        String nome="", endereco="";
        int cpf=0, telefone=0, i, totalVagos=0;
        double valor=0.0;
//Questao 3: Adicionar 4 proprieatrios e imoveis num arraylist.
        for(i=0; i<4;i++)
        {
            if(i==0)
            {
                nome="Armando";
                cpf=451069777;
                telefone=1180028922;

                endereco="Boa Vista";
                valor=75000.0;
            }
            else if(i==1)
            {
                nome="Josias";
                cpf=893134;
                telefone=190;

                endereco="Lapa";
                valor=70000.0;
            }
            else if(i==2)
            {
                nome="Atumalaca";
                cpf=387391;
                telefone=118578575;

                endereco="Paranapiacaba";
                valor=100000.0;
            }
            else if(i==3)
            {
                nome="Rodrigo Faro";
                cpf=718271;
                telefone=112993389;

                endereco="Pindamonhaguaba";
                valor=40000.5;
            }
            ProprietarioInfo = new Proprietario(nome, cpf, telefone);
            ProprietarioArray.add(ProprietarioInfo);
            ImovelInfo = new Imovel(nome, endereco, valor, true);
            ImovelArray.add(ImovelInfo);
        }
//Questao 3: Adicionar 4 proprieatrios e imoveis num arraylist.

//Questao 4: Contabilizar a quantidade de imoveis com status 'vago'

//Imovel sem proprietario adicionado para demonstrar
// o funcionamento correto da logica.
        endereco="Pirituba";
        nome="";
        valor=80000;
        ImovelInfo = new Imovel(nome, endereco, valor, false);
        ImovelArray.add(ImovelInfo);

        for(i=0; i<ImovelArray.size(); i++)
        {
            if(ImovelArray.get(i).getStatus()==false)
            {
                totalVagos++;
            }
        }
        System.out.println("Existem " + totalVagos + " imoveis vagos.");
//Questao 4: Contabilizar a quantidade de imoveis com status 'vago'

//Questao 5: procurar imoveis com um aluguel numa faixa de preco
//           e mostrar a informacao dos respectivos proprietarios
        for(i=0; i<ImovelArray.size(); i++)
        {
            if(ImovelArray.get(i).calcularAlugel()>2000
            && ImovelArray.get(i).calcularAlugel()<2500)
            {
                System.out.println("Imovel encontrado nos parametros");
                System.out.println("Proprietario: " + ImovelArray.get(i).getProprietario());
                System.out.println("Telefone: " + ProprietarioArray.get(i).getTelefone());
                System.out.println("Endereco: " + ImovelArray.get(i).getEndereco());
                System.out.println("CPF: " + ProprietarioArray.get(i).getCpf());
            }
        }
//Questao 5: procurar imoveis com um aluguel numa faixa de preco
//           e mostrar a informacao dos respectivos proprietarios
    }
}
