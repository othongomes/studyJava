package aplication;

import util.Converter;

import java.util.Scanner;

public class Program {

    public class Main {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("What is the dollar price: ");
            double price = sc.nextDouble();
            System.out.print("How many dollars will be bought? ");
            double beBought = sc.nextDouble();

            double p = Converter.CurrencyConverter(price);

            System.out.printf("Amount to be paid in reais = %.2f", p);

        }
    }
}
