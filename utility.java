import java.util.*;

public class Utility {
    public static void compare(int a, int b) {
        System.out.println(a == b ? "Both are equal." : (a > b ? a + " is greater." : b + " is greater."));
    }

    public static void compare(char a, char b) {
        System.out.println(a == b ? "Both are equal." : "'" + (a > b ? a : b) + "' is greater.");
    }

    public static void compare(String a, String b) {
        System.out.println(a.length() == b.length() ? "Both are equal." : "\"" + (a.length() > b.length() ? a : b) + "\" is greater.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter choice (1 for numbers, 2 for characters, 3 for strings): ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.print("Enter two numbers: ");
            compare(scanner.nextInt(), scanner.nextInt());
        } else if (choice == 2) {
            System.out.print("Enter two characters: ");
            compare(scanner.next().charAt(0), scanner.next().charAt(0));
        } else if (choice == 3) {
            scanner.nextLine();
            System.out.print("Enter first string: ");
            String str1 = scanner.nextLine();
            System.out.print("Enter second string: ");
            String str2 = scanner.nextLine();
            compare(str1, str2);
        } else {
            System.out.println("Invalid choice.");
        }

        scanner.close();
    }
}
