//App

public class App {
    public static void main(String[] args) throws Exception {
        Mesa m1 = new Mesa(1, 2, 0.0);
        Mesa m2 = new Mesa(2, 2, 0.0);

        m1.imprimir();
        m2.imprimir();

        //efetuar pedidos

        m1.efetuarPedido(1, 60.0);
        m1.efetuarPedido(2, 3.0);

        m2.efetuarPedido(1, 1.0);
        m2.efetuarPedido(3, 4.0);

        //definir metodo de pagamento e imprimir o valor final da conta e por pessoa

        m1.imprimirContaPorPessoa(1);
        m2.imprimirContaPorPessoa(2);

        //Imprimir a mesa com o maior valor gasto por pessoa

        if(m1.contaPorPessoa()>m2.contaPorPessoa()){
            System.out.println("A mesa com maior gasto por pessoa é a " + m1.getNum());
        }
        else{
            System.out.println("A mesa com maior gasto por pessoa é a " + m2.getNum());
        }


    }
}
