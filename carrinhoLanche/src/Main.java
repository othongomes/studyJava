import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        double tot;
        System.out.println("Digite o Código do produto: ");
        int codigoprod = sc.nextInt();
        System.out.println("Digite a Quantidade: ");
        int qtdprod = sc.nextInt();

        if (codigoprod == 1) {
            System.out.println("CAHORRO QUENTE");
            tot = (4.0 * qtdprod);
            System.out.println("Total: R$ " + tot);
        } else if (codigoprod == 2) {
            System.out.println("X-SALADA");
            tot = (4.5 * qtdprod);
            System.out.println("Total: R$ " + tot);
        } else if (codigoprod == 3) {
            System.out.println("X-BACON");
            tot = (5.0 * qtdprod);
            System.out.println("Total: R$ " + tot);
        } else if (codigoprod == 4) {
            System.out.println("TORRADA SIMPLES");
            tot = (2.0 * qtdprod);
            System.out.println("Total: R$ " + tot);
        } else {
            System.out.println("REFRIGERANTE");
            tot = (1.50 * qtdprod);
            System.out.println("Total: R$ " + tot);

        }

    }
}