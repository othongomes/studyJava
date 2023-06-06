import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int valor1, valor2;

        System.out.println("Digite o primerio valor: ");
        valor1 = sc.nextInt();
        System.out.println("Digite o segundo valor: ");
        valor2 = sc.nextInt();

        if (valor1 % valor2 == 0 || valor2 % valor1 ==0) {
            System.out.printf("São multiplos");
        } else {
            System.out.printf("Não são multiplos");
        }
    }
}