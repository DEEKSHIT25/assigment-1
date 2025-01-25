import java.util.*;

public class CalculateTotal {
    public static int calculateTotal(int value) { return value; }
    public static int calculateTotal(int value, int quantity) { return value * quantity; }
    public static int calculateTotal(int a, int b, int c) { return a + b + c; }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter choice (1, 2, or 3): ");
        int choice = scanner.nextInt();
        int res = 0;

        if (choice == 1) {
            System.out.print("Enter a value: ");
            res = calculateTotal(scanner.nextInt());
        } else if (choice == 2) {
            System.out.print("Enter price: ");
            int price = scanner.nextInt();
            System.out.print("Enter quantity: ");
            int quantity = scanner.nextInt();
            res = calculateTotal(price, quantity);
        } else if (choice == 3) {
            System.out.print("Enter three values: ");
            res = calculateTotal(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        }

        System.out.println("Total price: " + res);
        scanner.close();
    }
}
