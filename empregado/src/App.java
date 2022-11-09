//App

public class App {
    public static void main(String[] args) throws Exception {
        Double maior=0.0, menor=0.0, novo=0.0;
        Empregado e[] = new Empregado[3];
        e[0] = new Empregado("Tamiris", 1050.00);
        e[1] = new Empregado("Jose", 800.00);
        e[2] = new Empregado("Ana", 760.00);



        //Imprimir o nome do empregado com o maior salário

        for(int i=0; i<3; i++){
            if(i==0){
                maior=e[i].getSalario();
            }
            else if(maior<e[i].getSalario()){
                maior=e[i].getSalario();
            }
        }

        for(int i=0; i<3; i++){
            if(maior==e[i].getSalario()){
                System.out.println("O maior salário é do funcionário " + e[i].getNome());
            }
        }

        //Aumentar o salário do empregado com o menor salário em 30%

        for(int i=0; i<3; i++){
            if(i==0){
                menor=e[i].getSalario();
            }
            else if(menor>e[i].getSalario()){
                menor=e[i].getSalario();
            }
        }

        for(int i=0; i<3; i++){
            if(menor==e[i].getSalario()){
                e[i].setSalario(menor*1.3);
            }
        }

        novo=(menor*1.3);

        //Imprimir na tela se o novo salário do empregado, com menor salário, é maior do que o salário do empregado com maior salário.

        if(novo>menor){
            System.out.println("O novo salário é " + novo + ", sendo maior que o do empregado com maior salário");
        }

    }
}
