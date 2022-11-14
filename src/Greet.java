public class Greet {
    public static void greeting() {
        System.out.println("Select a Language/Waehle eine Sprache");
        System.out.print("Deutsch [DE] or English [EN]: ");
        String anwser = Main.scanner.next();
        String anwserUP = anwser.toUpperCase();

        switch (anwserUP) {
            case "DE":
                german();
                break;
            case "EN":
                english();
                break;
            default:
                System.out.println("Enter a valid option!");
        }
    }
    public static void german() {
        System.out.print("Ihr Name: ");
        String name = Main.scanner.next();
        System.out.print("Ihr Alter: ");
        int age = Main.scanner.nextInt();

        System.out.println("Sie heißen " + name + " und Sie sind " + age + " Jahre alt!");
    }
    public static void english() {
        System.out.print("Your name: ");
        String name = Main.scanner.next();
        System.out.print("Your age: ");
        int age = Main.scanner.nextInt();

        System.out.println("Your name is " + name + " and you are " + age + " years old!");

    }
}
