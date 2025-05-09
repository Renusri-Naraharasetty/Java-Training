import java.util.*;
public class recursionfactorial {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x;
		System.out.println("Enter a number : ");
		x=sc.nextInt();
		System.out.println(is_factorial(x));	
	}
	public static int is_factorial(int n) {
		if(n==1) {
			return 1;
		}
		else {
			return n*is_factorial(n-1);
		}
	}
		

}
