import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int duracao;

        System.out.println("Hora do início do jogo: ");
        int horaInicial = sc.nextInt();
        System.out.println("Hora do final do jogo: ");
        int horaFinal = sc.nextInt();

        if (horaInicial < horaFinal) {
            duracao = horaFinal - horaInicial;
        } else {
            duracao = 24 - horaInicial + horaFinal;
        }
        System.out.println("O jogo teve uma duração de " + duracao + " horas.");
    }
}