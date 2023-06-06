import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int A;
        int B;
        int C;
        int D;
        int result;

        System.out.print("Digite o 1º valor: ");
        A = sc.nextInt();
        System.out.print("Digite o 2º valor: ");
        B = sc.nextInt();
        System.out.print("Digite o 3º valor: ");
        C = sc.nextInt();
        System.out.print("Digite o 4º valor: ");
        D = sc.nextInt();

        result = (A*B-C*D);
        System.out.println("O resultado é " + result);
    }
}