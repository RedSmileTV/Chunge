import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //Main.menu();
        //GUI.gui();
        new GUI();

    }
    public static void menu() {
        System.out.println("1. Calculator");
        System.out.println("2. Greeting");
        System.out.println("3. Open GUI");
        System.out.print("Select: ");
        String selector = scanner.next();

        if (selector.equals("1")) {
            Calculator.ask();
        }
        if (selector.equals("2")) {
            Greet.greeting();
        }
        if (selector.equals("3")) {
        }
    }
}