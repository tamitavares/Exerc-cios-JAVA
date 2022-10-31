public class Tempo {
    private int s;
    int m, h;

    public int getS(){
        return s;
    }

    public void setS(int s){
        this.s = s;
    }

    //funções

    public Tempo(int s){
        this.s = 0;
    }

    public Tempo(){
        
    }

    public int horas(){
        return (s/3600);
    }

    public int minutos(){
        return ((s%3600)/60);
    }

    public int segundos(){
        return ((s%3600)%60);
    }

    public void imprimir(){
        System.out.println(horas() + "h" + minutos() + "m" + segundos() + "s");
    }

}
