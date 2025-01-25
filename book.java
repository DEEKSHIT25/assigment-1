import java.util.*;

class Book {
    String title, author;
    double price;
    int stock;

    Book(String title, String author, double price, int stock) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.stock = stock;
    }

    Book(String title, String author) {
        this(title, author, 500, 10);
    }

    public void displayDetails() {
        System.out.println("Book Details:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Stock: " + stock);
    }
}

public class BookShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter choice (1 for full book details, 2 for default price and stock): ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        Book book;

        if (choice == 1) {
            System.out.print("Enter book title: ");
            String title = scanner.nextLine();
            System.out.print("Enter book author: ");
            String author = scanner.nextLine();
            System.out.print("Enter book price: ");
            double price = scanner.nextDouble();
            System.out.print("Enter stock quantity: ");
            int stock = scanner.nextInt();
            book = new Book(title, author, price, stock);
        } else if (choice == 2) {
            System.out.print("Enter book title: ");
            String title = scanner.nextLine();
            System.out.print("Enter book author: ");
            String author = scanner.nextLine();
            book = new Book(title, author);
        } else {
            System.out.println("Invalid choice.");
            scanner.close();
            return;
        }

        book.displayDetails();
        scanner.close();
    }
}
