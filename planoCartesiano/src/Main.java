import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de x: ");
        double x = sc.nextDouble();
        System.out.println("Digite o valor de y: ");
        double y = sc.nextInt();

        if (x == 0.0 && y == 0.0) {
            System.out.println("ORIGEM");
        } else if (x == 0.0) {
            System.out.println("EIXO Y");
        } else if (y == 0.0) {
            System.out.println("EIXO X");
        } else if (x > 0.0 && y > 0.0) {
            System.out.println("Q1");
        } else if (x < 0.0 && y > 0.0) {
            System.out.println("Q2");
        } else if (x < 0.0 && y < 0.0) {
            System.out.println("Q3");
        } else {
            System.out.println("Q4");
            }
    }
}