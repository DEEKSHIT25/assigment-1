import java.util.*;

public class PrimeArrays {
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static ArrayList<Integer> UniqueFilter(ArrayList<Integer> list) {
        return new ArrayList<>(new HashSet<>(list));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        ArrayList<Integer> primes = new ArrayList<>();
        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            if (isPrime(num)) primes.add(num);
        }

        System.out.println("Prime numbers: " + primes);
        System.out.println("Unique prime numbers: " + UniqueFilter(primes));
        scanner.close();
    }
}
