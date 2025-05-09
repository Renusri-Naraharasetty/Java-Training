import java.util.*;
public class reverseBinary {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b;
		System.out.println("Enter the value of a: ");
		a=sc.nextInt();
		System.out.println("Enter the value of b: ");
		b=sc.nextInt();
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("The values of a and b are "+a+" and "+b);
	}

}
