import java.util.*;
public class seiveoferatosthenes {
	static void find(int n) {
		boolean prime[]=new boolean[n+1];
		for (int i=0;i<=n;i++) {
			prime[i]=true;
		}
		for(int i=2;i<=n;i++) {
			if(prime[i]==true) {
				for(int j=i+1;j<=n;j++) {
					if(j%i==0) {
						prime[j]=false;
					}
				}
			}
		
		}
		for(int i=2;i<=n;i++) {
			if(prime[i]==true) {
				System.out.println(i);
			}
		}
	}
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		find(n);
	}
}
