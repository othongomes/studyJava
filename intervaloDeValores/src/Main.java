import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int A = sc.nextInt();


        if (A >=0 && A < 25) {
            System.out.println("INTERVALO ENTRE 0 À 25");
        } else if (A >= 25 && A < 50) {
            System.out.println("INTERVALO ENTRE 25 À 50");
        } else if (A >= 50 && A < 75) {
            System.out.println("INTERVALO ENTRE 50 À 75");
        } else if (A >= 75 && A < 100) {
            System.out.println("INTERVALO ENTRE 75 À 100");
        } else {
            System.out.println("FORA DO INTERVALO DE 0 À 100");
        }
    }
}