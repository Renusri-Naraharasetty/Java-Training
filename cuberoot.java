import java.util.Scanner;
public class cuberoot {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		double n=sc.nextDouble();
		double guess=n/3;
		for(int i=0;i<25;i++) {
			guess=(2.0*guess+n/(guess*guess))/3.0;
		}
		System.out.println("The cube of the number is "+guess);
		
	}
}
