import java.util.*;
public class RecGcd {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n1,n2;
		System.out.println("Enter two numbers : ");
		n1=sc.nextInt();
		n2=sc.nextInt();
		System.out.println("The gcd of those two numbers is :"+gcd(n1,n2));
	}
	static int gcd(int a,int b) {
		if(b==0) {
			return a;
		}
		else {
			return gcd(b,a%b);
		}
	}

}
