import java.util.Scanner;
public class Fibbonaci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int terms = scanner.nextInt(); 
        System.out.println("Fibonacci Series using Iteration up to " + terms + " terms:");
        printFibonacci(terms);
    }
    static void printFibonacci(int terms) {
        int a = 0, b = 1;
        for (int i = 0; i < terms; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}

