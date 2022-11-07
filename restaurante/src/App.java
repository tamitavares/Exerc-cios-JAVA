import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        Scanner entradaStr = new Scanner(System.in); 
        int pessoas, cod=0;
        Double qtde, contaTotal=0.0;
        Produtos a = new Produtos(1, "Refrigerante", 2.00);
        Produtos b = new Produtos(2, "Cachorro Quente", 5.00);
        Produtos c = new Produtos(3, "Batata frita", 4.00);


        System.out.println("Mesa 1:");
        System.out.print("Quantidade de pessoas: ");
        pessoas=entrada.nextInt();
        Mesa m1 = new Mesa(1, pessoas, 0.0);
        
        System.out.println("Mesa 2:");
        System.out.print("Quantidade de pessoas: ");
        pessoas=entrada.nextInt();
        Mesa m2 = new Mesa(2, pessoas, 0.0);

        System.out.println("--------------");
        System.out.println("Todas as mesas:");
        m1.imprimir();
        m2.imprimir();

        a.imprimirProdutos();
        b.imprimirProdutos();
        c.imprimirProdutos();

        contaTotal=0.0;
        System.out.println("--------------");
        System.out.println("Pedidos Mesa 1: Digite o código do produto");
        for(int i=0; i<2; i++){
            System.out.print("Pedido " + (i+1) + ", código: ");
            if(cod==1){
                a.setCod(entrada.nextInt());
                System.out.print("Quantidade: ");
                qtde = entrada.nextDouble();
                contaTotal += a.soma(qtde);
            }else if(cod==2){
                b.setCod(entrada.nextInt());
                System.out.print("Quantidade: ");
                qtde = entrada.nextDouble();
                contaTotal += b.soma(qtde);
            }else{
                c.setCod(entrada.nextInt());
                System.out.print("Quantidade: ");
                qtde = entrada.nextDouble();
                contaTotal += c.soma(qtde);
            }
        }
        m1.setConta(contaTotal);


        contaTotal=0.0;
        System.out.println("--------------");
        System.out.println("Pedidos Mesa 2: Digite o código do produto");
        for(int i=0; i<2; i++){
            System.out.print("Pedido " + (i+1) + ", código: ");
            if(cod==1){
                a.setCod(entrada.nextInt());
                System.out.print("Quantidade: ");
                qtde = entrada.nextDouble();
                contaTotal += a.soma(qtde);
            }else if(cod==2){
                b.setCod(entrada.nextInt());
                System.out.print("Quantidade: ");
                qtde = entrada.nextDouble();
                contaTotal += b.soma(qtde);
            }else{
                c.setCod(entrada.nextInt());
                System.out.print("Quantidade: ");
                qtde = entrada.nextDouble();
                contaTotal += c.soma(qtde);

            }

        }
        m2.setConta(contaTotal);

        System.out.println("--------------");
        m1.imprimirContaPorPessoa();
        m2.imprimirContaPorPessoa();

        //calcular maior valorgasto por pessoa
        if(m1.contaPorPessoa() > m2.contaPorPessoa()){
            System.out.println("O maior gasto por pessoa é da mesa 1");
        }else{
            System.out.println("O maior gasto por pessoa é da mesa 2");
        }

        entrada.close();
        entradaStr.close();
    }
}
