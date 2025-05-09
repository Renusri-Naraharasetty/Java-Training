import java.util.*;
public class hammingDistance {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b;
		System.out.println("Enter the first value : ");
		a=sc.nextInt();
		System.out.println("Enter the second value : ");
		b=sc.nextInt();
		int res=a^b;
		int count=0;
		while(res>0) {
			int res1=res&1;
			res=res>>1;
			if(res1==1)
				count+=1;
		}	
		System.out.println("The hamming distance is "+count);
	}
}
