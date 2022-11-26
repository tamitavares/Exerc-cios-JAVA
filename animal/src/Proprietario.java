public class Proprietario {
    private String nome;
    private String telefone;
    private Animal animal;

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome=nome;
    }

    public String getTelefone(){
        return telefone;
    }
    public void setTelefone(String telefone){
        this.telefone=telefone;
    }

    public Animal getAnimal(){
        return animal;
    }
    public void setAnimal(Animal animal){
        this.animal=animal;
    }

    public Proprietario(String nome, String telefone, Animal animal){
        this.nome=nome;
        this.telefone=telefone;
        this.animal=animal;
    }

    public Proprietario(){
        animal = new Animal();
    }

    public void imprimir(){
        System.out.println("\nProprietário: "+ nome);
        System.out.println("Telefone: "+ telefone);
        animal.imprimir();
    }

}
