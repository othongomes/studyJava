import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int alcool=0;
        int gasolina=0;
        int diesel=0;

        System.out.println("1.Álcool\n2.Gasolina\n3.Diesel\n4.Fim");

        int x = sc.nextInt();

        while (x != 4) {
            if (x == 1){
                alcool += 1;
            } else if (x==2) {
                gasolina += 1;
            } else if (x==3){
                diesel += 1;
            } else {
                System.out.printf("Opção Inválida\n");
            }

            x = sc.nextInt();
        }
            System.out.println("Muito Obrigado!");
            System.out.printf("Alcool: %d%nGasolina: %d%nDiesel: %d", alcool, gasolina, diesel);
        }

}