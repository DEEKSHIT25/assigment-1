import java.util.*;

class Order {
    String customerName, cakeType;
    int quantity;
    double pricePerCake;

    Order(String name, String type, int qty) {
        customerName = name;
        cakeType = type;
        quantity = qty;
        pricePerCake = type.equalsIgnoreCase("Chocolate") ? 350 : type.equalsIgnoreCase("Vanilla") ? 300 : 250;
    }

    public double calculateTotalPrice() {
        return quantity * pricePerCake;
    }

    public void displayOrderDetails() {
        System.out.println("Order Details:");
        System.out.println("Customer Name: " + customerName);
        System.out.println("Cake Type: " + cakeType);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price per Cake: " + pricePerCake);
        System.out.println("Total Price: ₹" + calculateTotalPrice());
    }
}

public class CakeShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter customer name: ");
        String name = scanner.nextLine();
        System.out.print("Enter cake type (Chocolate/Vanilla/Others): ");
        String type = scanner.nextLine();
        System.out.print("Enter quantity: ");
        int qty = scanner.nextInt();

        new Order(name, type, qty).displayOrderDetails();
        scanner.close();
    }
}
