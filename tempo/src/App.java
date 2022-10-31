import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        Tempo t = new Tempo();

        System.out.print("Entrada em segundos: ");
        t.setS(entrada.nextInt());
        t.imprimir();

        entrada.close();
    }
}
