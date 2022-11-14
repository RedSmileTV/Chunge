import javax.swing.*;
import java.util.Scanner;

public class Calculator {

    public static void ask() {
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("");
        System.out.print("Select: ");
        String selector = Main.scanner.next();
    }

    public static int add(int num1, int num2) {
        int ans = num1 + num2;
        return ans;
    }
    public static int subtract(int num1, int num2) {
        int ans = num1 - num2;
        return ans;
    }

}
