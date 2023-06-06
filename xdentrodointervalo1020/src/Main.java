import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y;
        int soma=0;
        int soma2=0;

        for (int i=1; i<=x; i++) {
            y = sc.nextInt();
            if (y>=10 && y<=20){
                soma += 1;
            } else {
                soma2 += 1;
            }

        }
        System.out.printf("%d in",soma);
        System.out.printf("\n%d out", soma2);
    }
}