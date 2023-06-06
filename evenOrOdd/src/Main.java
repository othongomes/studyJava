import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int value;

        System.out.println("Enter a value: ");
        value = sc.nextInt();

        if (value % 2 == 0) {
            System.out.printf("O valor é PAR");
        } else {
            System.out.printf("O valor é IMPAR");
        }
    }
}