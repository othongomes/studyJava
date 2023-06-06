import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double x;
        double y;
        double result;

        System.out.println("Digite o n: ");
        x = sc.nextDouble();
        System.out.println("Digite o 2º valor: ");
        y = sc.nextDouble();
        result = x + y;
        System.out.println("O resultado é " + result);

    }
}