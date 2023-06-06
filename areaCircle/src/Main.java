import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double radius;
        double area;


        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        radius = sc.nextDouble();

        area = Math.PI * Math.pow(radius, 2.0);
        System.out.print("The area of a circle of radius %f is %.4f", radius, area);


    }
}