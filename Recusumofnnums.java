import java.util.*;
public class Recusumofnnums {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x;
		System.out.println("Enter a number :");
		x=sc.nextInt();
		System.out.println(sum(x));
	}
	static int sum(int n) {
		if(n==1) {
			return 1;
		}
		return n+sum(n-1);
	}

}
