import java.util.*;
public class SumUsingRecursion {
    
    public static int sum(int[] arr, int n) {
        if (n <= 0) {
            return 0;
        }
        return sum(arr, n - 1) + arr[n - 1];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt(); 

        int[] arr = new int[n]; 

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int result = sum(arr, arr.length);
        System.out.println("Sum of array elements: " + result);
    }
}