import java.util.*;
public class noOfOnesInBin {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter a number :");
		n=sc.nextInt();
		int count=0;
		while(n>0) {
			int res=n&1;
			n=n>>1;
			if(res==1)
				count+=1;
		}	
		System.out.println("The number of ones are "+count);
	}
}
