import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
       ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();
       int op;
       String opStr;
       Scanner entrada = new Scanner(System.in);
       
       do{

            System.out.println("\n---Menu---");
            System.out.println("[1] Cadastro");
            System.out.println("[2] Busca do professor pela disciplina");
            System.out.println("[3] Busca por titulação");
            System.out.println("[4] Mostrar todas as disciplinas de um professor");
            System.out.println("[5] Sair");
            System.out.print("Opção: ");
            op=entrada.nextInt();
            
            switch(op){
                case 1: System.out.println("\nCadastro");
                        Professor p1 = new Professor("Ana", "quimica", 10);
                        Disciplina d1 = new Disciplina("Quimica", 15, p1);

                        disciplinas.add(d1);

                        Professor p2 = new Professor("Jose", "geografo", 10);
                        Disciplina d2 = new Disciplina("Geografia", 5, p2);

                        disciplinas.add(d2);

                        Professor p3 = new Professor("Giovana", "quimica", 20);
                        Disciplina d3 = new Disciplina("Quimica", 20, p3);

                        disciplinas.add(d3);

                        Professor p4 = new Professor("Giovana", "quimica", 20);
                        Disciplina d4 = new Disciplina("Matematica", 20, p4);

                        disciplinas.add(d4);

                        break;
                
                case 2: System.out.println("\nBusca do professor pela disciplina");
                        System.out.println("Disciplina buscada: Geografia");
                        opStr="Geografia";
                        for(int i=0; i<disciplinas.size(); i++){
                            if(disciplinas.get(i).getNome().equals(opStr)){
                                disciplinas.get(i).getP().imprimir();
                            }
                        }

                        break;

                case 3: System.out.println("\nBusca por titulação");
                        System.out.println("Titulação buscada: quimica");
                        opStr="quimica";
                        for(int i=0; i<disciplinas.size(); i++){
                            if(disciplinas.get(i).getP().getTitulacao().equals(opStr)){
                                System.out.println("Professor: " + disciplinas.get(i).getP().getNome());
                            }
                        }

                        break;

                case 4: System.out.println("\nMostrar todas as disciplinas de um professor");
                        System.out.print("Professor buscado: Giovana");
                        opStr="Giovana";
                        for(int i=0; i<disciplinas.size(); i++){
                            if(disciplinas.get(i).getP().getNome().equals(opStr)){
                                System.out.println("Disciplina: " + disciplinas.get(i).getNome());
                            }
                        }

                        break;
            }

       }while(op!=5);
       
       entrada.close();

    }
}
