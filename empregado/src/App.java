import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        Scanner entradaStr = new Scanner(System.in);
        Empregado e[] = new Empregado[3];
        String nome;
        Double salario;
        Double maior = 0.0;
        Double menor = 0.0;
        Double novo = 0.0; 

        for(int i=0; i<3; i++){
            System.out.print("Nome do empregado " + (i+1) + ": ");
            nome = entradaStr.nextLine();
            System.out.print("Salario do empregado " + (i+1) + ": ");
            salario = entrada.nextDouble();
            if(salario<0){
                salario=0.0;
            }
            e[i] = new Empregado(nome, salario);
        }
        
        //calcula maior
        for(int i=0; i<3; i++){
            if(i==0){
                maior=e[i].getSalario();
            }
            if(maior<e[i].getSalario()){
                maior=e[i].getSalario();
            }
        }
        //imprime maior
        for(int i=0; i<3; i++){
            if(maior==e[i].getSalario()){
                e[i].imprimirNome();
            }
        }
        //calcula menor
        for(int i=0; i<3; i++){
            if(i==0){
                menor=e[i].getSalario();
            }
            if(menor>e[i].getSalario()){
                menor=e[i].getSalario();
            }
        }
        //aumenta salario do menor
        for(int i=0; i<3; i++){
            if(menor==e[i].getSalario()){
                novo = e[i].calcularSalario(0.3);
            }
        }
        //compara se o menor salário é maior do que o maior salario
        if(novo>maior){
            System.out.println("O novo salário é maior que o maior salário");
            System.out.println("Ele passou a ser "+ novo +" reais");
        }       


        entrada.close();
        entradaStr.close();
    }
}
