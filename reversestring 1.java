import java.util.*;

public class ReverseArrString {
    public static void ReverseArr(String[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            String temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        String arr[] = new String[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextLine();
        }

        System.out.println("Original array: " + Arrays.toString(arr));
        ReverseArr(arr);
        System.out.println("Reversed array: " + Arrays.toString(arr));
        scanner.close();
    }
}
