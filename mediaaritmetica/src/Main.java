import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        double media = 0;

        for (int i=0;i<x;i++){
            double valor1 = sc.nextDouble();
            double valor2 = sc.nextDouble();
            double valor3 = sc.nextDouble();
            media = ((valor1*2)+(valor2*3)+(valor3*5))/10;
            System.out.printf("%.1f%n", media);
        }

    }
}