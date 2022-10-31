import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entradaS = new Scanner(System.in);
        Scanner entrada = new Scanner(System.in);
        Aluno a = new Aluno();

        System.out.print("Digite o nome: ");
        a.setNome(entradaS.nextLine());
        System.out.print("Digite o endereco: ");
        a.setEndereco(entradaS.nextLine());
        System.out.print("Digite a idade: ");
        a.setIdade(entrada.nextInt());
        System.out.print("Digite o sexo (f/m): ");
        a.setSexo(entradaS.nextLine().charAt(0));
        System.out.print("Digite o rg: ");
        a.setRg(entradaS.nextLine());
        System.out.print("Digite o curso: ");
        a.setCurso(entradaS.nextLine());
        
        System.out.println("\nResultado:");
        a.imprimir();
        System.out.println("\n");

        entrada.close();
        entradaS.close();
    }
}
