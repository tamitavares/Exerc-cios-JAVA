import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        Scanner entradaS = new Scanner(System.in);
        Vinho v[] = new Vinho[3];
        Double caro = 0.0;
        int velho = 0;
        String nome, tipo;
        int dia, mes, ano;
        Double preco;


        for(int i=0; i<3; i++){
            System.out.println("Vinho " + (i+1));
            System.out.print("Nome do vinho: ");
            nome = entradaS.nextLine();
            System.out.print("Tipo: ");
            tipo = entradaS.nextLine();
            System.out.println("Ano de fabricação");
            System.out.print("Dia: ");
            dia = entrada.nextInt();
            System.out.print("Mês: ");
            mes = entrada.nextInt();
            System.out.print("Ano: ");
            ano = entrada.nextInt();
            System.out.print("Preço: ");
            preco = entrada.nextDouble();

            v[i] = new Vinho(nome, tipo, dia, mes, ano, preco);
        }

        for(int i=0; i<3; i++){
            if(i==0)
                caro = v[i].getPreco();
            if(caro < v[i].getPreco()){
                caro = v[i].getPreco();
            }
        }

        for(int i=0; i<3; i++){
            if(caro == v[i].getPreco()){
                v[i].imprimirCaro();
            }
        }

        
                


        entrada.close();
        entradaS.close();
    }
}
