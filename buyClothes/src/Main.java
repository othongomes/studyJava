import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codigo1, qtd1;
        int codigo2, qtd2;
        double preco1, preco2;
        double tot;

        System.out.print("Digite o código da peça: ");
        codigo1 = sc.nextInt();
        System.out.print("Qual o numero de peças?: ");
        qtd1 = sc.nextInt();
        System.out.print("Qual o preço da peça?: ");
        preco1 = sc.nextDouble();

        System.out.print("Digite o código da peça: ");
        codigo2 = sc.nextInt();
        System.out.print("Qual o numero de peças?: ");
        qtd2 = sc.nextInt();
        System.out.print("Qual o preço da peça?: ");
        preco2 = sc.nextDouble();


        tot = ((qtd1 * preco1) + (qtd2 * preco2));

        System.out.printf("VALOR A PAGAR %.2f", tot);
    }
}