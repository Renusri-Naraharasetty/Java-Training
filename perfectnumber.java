import java.util.Scanner;

public class perfectnumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		int count = 0;
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				count += i;
			}
		}
		if (count == n && n != 0) {
			System.out.println("The number is a perfect number");
		} else {
			System.out.println("The number is not a perfect square");
		}
	}

}
