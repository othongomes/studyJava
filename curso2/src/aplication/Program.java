package aplication;

import java.util.Locale;
import java.util.Scanner;

import entitites.Triangle;

public class Program {
    public static void main (String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Entre coz m as medidas do triangulo x:");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Entre com as medidas do triangulo y:");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areax = x.area();
        double areay = y.area();

        System.out.printf("Triangulo X area: %.4f%n", areax);
        System.out.printf("Triangulo X area: %.4f%n", areay);

        if (areax > areay){
            System.out.println("Maior area: X");
        } else {
            System.out.println("Maior area: Y");
        }

    }
}