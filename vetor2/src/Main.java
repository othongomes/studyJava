import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double soma, media;
        int n = sc.nextInt();
        double[] vetor = new double[n];

        for (int i=0; i< vetor.length; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextDouble();
        }

        double sum = 0.0;
        for (int i=0; i< vetor.length;i++) {
            sum += vetor[i];
        }

        media = sum / vetor.length;

        for (int i=0; i<n; i++) {
            System.out.printf("%.1f  %n", vetor[i]);
        }
        System.out.println(sum);
        System.out.println(media);

        }
    }