import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // println() is like addting \n at the end
        System.out.println("Enter your name: ");
        // next() doesnt read any spaces, use nextLine() if may space
        String name = sc.nextLine();

        // System.out.print("Enter your age: ");
        // int age = sc.nextInt();

        System.out.print("What is your GWA? ");
        double gwa = sc.nextDouble();

        System.out.println("Are you a student? (true/false)");
        boolean isStudent = sc.nextBoolean();

        System.out.println("Hello " + name);
        // System.out.println("You are " + age + " years old");
        System.out.println("Your GWA is " + gwa);
        if (isStudent) {
            System.out.println("You are ENROLLED");
        } else {
            System.out.println("You are NOT ENROLLED");
        }

        // COMMON ISSUES

        // 1. accepting int/double then string fixed by adding sc.nextLine() after
        // int/double assignment.

        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter your favorite color: ");
        String color = sc.nextLine();

        System.out.println("You are " + age + " years old");
        System.out.println("Your favorite color is " + color);

        sc.close();

    }
}