import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // MAD LIBS GAME
        Scanner sc = new Scanner(System.in);

        String adjective1;
        String adjective2;
        String adjective3;
        String noun1;
        String verb1;

        System.out.print("Enter an adjective (description): ");
        adjective1 = sc.nextLine();
        System.out.print("Enter a verb: ");
        verb1 = sc.nextLine();
        System.out.print("Enter an adjective (description): ");
        adjective2 = sc.nextLine();
        System.out.print("Enter a noun: ");
        noun1 = sc.nextLine();
        System.out.print("Enter an adjective (description): ");
        adjective3 = sc.nextLine();

        System.out.println("\nToday I went to a " + adjective1 + " zoo.");
        System.out.println("In an exhibit, I saw a " + noun1 + ".");
        System.out.println(noun1 + " was " + adjective2 + " and " + verb1 + "!");
        System.out.println("I was " + adjective3 + "!");

        sc.close();

    }
}