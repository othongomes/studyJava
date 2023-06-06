
public class Main {
    public static void main(String[] args) {
        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;
        System.out.printf("Products:%n %s, which price is $%.2f%n %s, " +
                "which price is $%.2f%n%n Record: %d years old, code 5290 and gender: F%n%n Measure with eight" +
                " decimal places: 53,23456700%n Rouded (tree decimal places): 53,235%n US decimal point: 53.235", product1, price1, product2, price2,age);


    }
}