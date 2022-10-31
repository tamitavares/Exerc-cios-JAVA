import java.util.*;

public class Matricula {
    Scanner entrada = new Scanner(System.in);
    private String nome;
    private String matricula;
    private Double notas[] = new Double[3];
    public Double m;

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getMatricula(){
        return matricula;
    }
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }

    public Double[] getNotas(){
        return notas;
    }
    public void setNotas(Double[] notas){
        this.notas = notas;
    }


    //funções
    public Double media(){
        m=0.0;
        for(int i=0; i<3; i++){
            m+=notas[i];
        }
        return (m/3);
    }

    public void receberNotas(){
        for(int i=0; i<3; i++){
            System.out.print((i+1) + "º nota: ");
            notas[i] = entrada.nextDouble();
        }
    }
}
