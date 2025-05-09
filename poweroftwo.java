import java.util.*;
public class poweroftwo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean result;
		result=(n>0)&&((n&(n-1))==0);
		if(result==true) {
			System.out.println("The number is a power of two");
		}
		else {
			System.out.println("The number is not a power of two");
		}
	}
}
