public class App {
    public static void main(String[] args) {
        // 📌 A *variable* is a named storage for data. It has a type and a value.

        // 🔹 Primitive: Stores actual data (e.g., int, double, char, boolean).
        // 🔹 Reference: Stores memory address of an object (e.g., String, arrays,
        // custom classes).

        // ✅ Two steps to create a variable:
        // 1️⃣ Declare: Specify type and name → `int age;`
        // 2️⃣ Initialize: Assign a value → `age = 20;` (or do both in one step: `int
        // age = 20;`)

        int age = 20;
        int year = 2025;
        System.out.println(age);
        System.out.println("The year is " + year);

        double gpa = 1.22;
        double temp = -12.5;
        double price = 69.99;

        System.out.println(gpa);
        System.out.println(temp);
        System.out.println("$" + price);

        char grade = 'A';
        char symbol = '@';
        char currency = '$';

        System.out.println(grade);
        System.out.println(symbol);
        System.out.println(currency);

        boolean isStudent = true;
        boolean isWorking = false;
        boolean forSale = false;

        if (forSale) {
            System.out.println("You are a for sale!");

        } else {
            System.out.println("You are not for sale!");
        }
        // pag char single quote, pag string double quote
        String name = "George Allz";
        String food = "okra";
        String email = "georgeallz@gmail.com";
        String car = "Mercedes";
        String color = "gray";

        System.out.println("Hello! " + name);
        System.out.println("My favorite food is " + food);
        System.out.println("Email: " + email);

        System.out.println("Your choice is " + color + " " + year + " " + car);
        System.out.println("The price is $" + price);

    }
}