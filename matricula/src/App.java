import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        Scanner entradaS = new Scanner(System.in);
        Double media1, media2;
        Matricula m1 = new Matricula();
        Matricula m2 = new Matricula();

        System.out.println("\n1º Matricula");
        System.out.print("Nome: ");
        m1.setNome(entradaS.nextLine());
        System.out.print("Matrícula: ");
        m1.setMatricula(entradaS.nextLine());
        m1.receberNotas();
        media1 = m1.media();

        System.out.println("\n2º Matricula");
        System.out.print("Nome: ");
        m2.setNome(entradaS.nextLine());
        System.out.print("Matrícula: ");
        m2.setMatricula(entradaS.nextLine());
        m2.receberNotas();
        media2 = m2.media();

        if(media1>media2){
            System.out.println("\nO aluno " + m1.getNome() + " com matrícula " + m1.getMatricula() + " tem a maior média (" + media1 + ")");
        }else{
            System.out.println("\nO aluno " + m2.getNome() + " com matrícula " + m2.getMatricula() + " tem a maior média (" + media2 + ")");
        }

        entrada.close();
        entradaS.close();
    }
}
