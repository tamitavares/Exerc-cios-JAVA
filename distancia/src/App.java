import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        Distancia d = new Distancia();

        System.out.println("Digite o 1º ponto");
        System.out.print("X1: ");
        d.setX1(entrada.nextDouble());
        System.out.print("X2: ");
        d.setX2(entrada.nextDouble());
        System.out.println("Digite o 2º ponto");
        System.out.print("Y1: ");
        d.setY1(entrada.nextDouble());
        System.out.print("Y2: ");
        d.setY2(entrada.nextDouble());
        d.imprimir();

        entrada.close();
    }
}
