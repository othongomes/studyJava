import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int A;
        int B;
        double C;
        double result;

        System.out.print("Enter the employee number: ");
        A = sc.nextInt();
        System.out.print("Worked hours: ");
        B = sc.nextInt();
        System.out.print("Salary vs time: ");
        C = sc.nextDouble();

        result = (B*C);

        System.out.printf("NUMBER = %d%nSALARY = U$%.2f", A, result);
    }
}