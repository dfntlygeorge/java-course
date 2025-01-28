import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        // Calculate area of a rectangle
        double length = 0;
        double width = 0;
        double area = 0;
        String unit = "";
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a unit: ");
        unit = sc.nextLine();

        System.out.print("Enter length: ");
        length = sc.nextDouble();

        System.out.print("Enter width: ");
        width = sc.nextDouble();

        area = length * width;

        System.out.println("Area: " + area + " " + unit + "²");

        sc.close();

    }
}