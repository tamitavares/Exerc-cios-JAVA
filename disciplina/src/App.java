import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        Scanner entradaStr = new Scanner(System.in);
        int op=0, chP, chD;
        String nomeP, titulacaoP, nomeD;
        Professor p;
        Disciplina d;
        ArrayList <Disciplina> disciplinas = new ArrayList <Disciplina> ();
       

        do{
            System.out.println("\n---------Menu---------");
            System.out.println("[1]Cadastrar Disciplina");
            System.out.println("[2]Buscar Disciplina");
            System.out.println("[3]Buscar Titulação");
            System.out.println("[4]Listar disciplinas de um professor");
            System.out.println("[5]Listar todas as disciplinas");
            System.out.println("[6]Finalizar");
            System.out.println("----------------------");
            System.out.print("Opção: ");

            op = entrada.nextInt();
 

            switch (op){

                case 1: System.out.println("\n----Cadastro da Disciplina----");
                        System.out.print("Nome Professor: ");
                        nomeP = entradaStr.nextLine();
                        System.out.print("Titulação: ");
                        titulacaoP = entradaStr.nextLine();
                        System.out.print("Carga Horária do Professor: ");
                        chP = entrada.nextInt();
                        System.out.print("Nome Disciplina: ");
                        nomeD = entradaStr.nextLine();
                        System.out.print("Carga Horária da Disciplina: ");
                        chD = entrada.nextInt();

                        p = new Professor(nomeP, titulacaoP, chP);
                        d = new Disciplina(nomeD, chD, p);
                        disciplinas.add(d);
 
                        break;

                case 2: System.out.println("\n----Buscar Disciplina----");
                        System.out.print("Disciplina a ser buscada: ");
                        nomeD = entradaStr.nextLine();
                        for(int i=0; i<disciplinas.size(); i++){
                            if(disciplinas.get(i).getNome().equals(nomeD)){
                                System.out.println("Professor dessa disciplina: " + disciplinas.get(i).getP().getNome());
                            }
                        }

                        break;

                case 3: System.out.println("\n----Buscar Titulação----");
                        System.out.print("Titulação a ser buscada: ");
                        titulacaoP = entradaStr.nextLine();
                        for(int i=0; i<disciplinas.size(); i++){
                            if(disciplinas.get(i).getP().getTitulacao().equals(titulacaoP)){
                                System.out.println("Professor com essa titulação: " + disciplinas.get(i).getP().getNome());
                            }
                        }
                
                        break;

                case 4: System.out.println("\n----Disciplinas de um Professor----");
                        System.out.print("Professor a ser buscado: ");
                        nomeP = entradaStr.nextLine();
                        for(int i=0; i<disciplinas.size(); i++){
                            if(disciplinas.get(i).getP().getNome().equals(nomeP)){
                                System.out.println("Disciplina: " + disciplinas.get(i).getNome());
                            }
                        }

                        break;
                
                case 5: System.out.println("\n----Todas as Disciplinas----");
                        for(int i=0; i<disciplinas.size(); i++){
                            disciplinas.get(i).imprimir();
                        }
                        
                        break;

            }

        }while(op!=6);
        
        


        entrada.close();
        entradaStr.close();
    }

    public static int gerarMenu() {
        System.out.println("\n---------Menu---------");
        System.out.println("[1]Cadastrar Disciplina");
        System.out.println("[2]Buscar Disciplina");
        System.out.println("[3]Buscar Titulação");
        System.out.println("[4]Listar disciplinas de um professor");
        System.out.println("[5]Finalizar");
        System.out.println("----------------------");
        System.out.print("Opção: ");
        try (Scanner entrada = new Scanner(System.in)) {
            int op = entrada.nextInt();
            return op;
        }
    }

}
