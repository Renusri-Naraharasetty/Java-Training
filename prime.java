import java.util.Scanner;
public class prime {
	static boolean isPrime(int n) {
		if(n<2) {
			return false;
		}
		for(int i=2;i<n/2;i++) {
			if(n%i==0) {
				return false;
				}
			}
		return true;
		}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n1=scan.nextInt();
		int n2=scan.nextInt();
		for(int i=n1;i<=n2;i++) {
			if(isPrime(i)) {
				System.out.println(i);
			}
		}
	}
}
