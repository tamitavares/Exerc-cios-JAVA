import java.util.*;

public class App{
    public static void main(String[] arg){
        ArrayList <Pessoa> pessoas = new ArrayList <Pessoa>();

        System.out.println("Tamanho inicial: " + pessoas.size());

        pessoas.add(new Pessoa("Maria", "123"));
        pessoas.add(new Pessoa("Jose", "456"));
        pessoas.add(new Pessoa("Paulo", "789"));

        System.out.println("Tamanho atualizado: " + pessoas.size());
        System.out.println("Está vazio? " + pessoas.isEmpty());

        for(int i=0; i<pessoas.size(); i++){
            System.out.println("---------------------");
            System.out.println("Nome: " + pessoas.get(i).getNome());
            System.out.println("CPF: " + pessoas.get(i).getCpf());
        }

        pessoas.remove(1);

        //for each - percorre uma coleção de objetos
        System.out.println("---------------------");
        System.out.println("Pessoas atualizado");
        for(Pessoa x : pessoas){
            System.out.println("Nome: " + x.getNome());
            System.out.println("CPF: " + x.getCpf());
        }

    } 
}


//ArrayList() - cria uma lista
//.add() - adiciona elemento ao final 
//.get(i) - retorna o elemento na posição i
//.size() - retorna tamanho
//.isEmpty() - retorna se boolean se a lista estiver ou não vazia
//.remove(i) - remove elemento da posição do index
//.clear() - remove todos os elementos da lista
//.indexOf() - retorna o índice do elemento especificado

//ArrayList <Tipo> identificador = new ArrayList <tipo> ();