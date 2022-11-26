import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList <Proprietario> proprietarios = new ArrayList<Proprietario>();
        Scanner entrada = new Scanner(System.in);
        Scanner entradaStr = new Scanner(System.in);
        String nomeP, telefoneP, nomeA, racaA, corA;
        int anoA, op=0; 
        Animal a;
        Proprietario p;

        do{
            System.out.println("\n---Menu---");
            System.out.println("[1] Cadastrar proprietário");
            System.out.println("[2] Busca proprietário");
            System.out.println("[3] Imprimir proprietários");
            System.out.println("[4] Saída");

            System.out.print("\nOpção: ");
            op=entrada.nextInt();


            switch(op){
                case 1: //animal
                        System.out.print("\nNome do animal: ");
                        nomeA=entradaStr.nextLine();
                        System.out.print("Raça: ");
                        racaA=entradaStr.nextLine();
                        System.out.print("Cor: ");
                        corA=entradaStr.nextLine();
                        System.out.print("Ano de Nascimento: ");
                        anoA=entrada.nextInt();

                        //proprietario
                        System.out.print("\nNome do Proprietário: ");
                        nomeP=entradaStr.nextLine();
                        System.out.print("Telefone: ");
                        telefoneP=entradaStr.nextLine();

                        a = new Animal(nomeA, racaA, corA, anoA);
                        p = new Proprietario(nomeP, telefoneP, a);

                        proprietarios.add(p);

                        break;

                case 2: System.out.println("\n---Busca proprietário---");
                        System.out.print("Proprietário buscado: ");
                        nomeP=entradaStr.nextLine();
                        for(int i=0; i<proprietarios.size(); i++){
                            if(proprietarios.get(i).getNome().equals(nomeP)){
                                System.out.println("Nome animal: " + proprietarios.get(i).getAnimal().getNome());
                            }
                        }

                        break;

                case 3: System.out.println("\nTodos os proprietários");
                        for(int i=0; i<proprietarios.size(); i++){
                            proprietarios.get(i).imprimir();
                        }

                        break;
            }


        }while(op!=4);

        
        





        entrada.close();
        entradaStr.close();
    }
}
