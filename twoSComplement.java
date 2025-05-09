import java.util.*;
public class twoSComplement {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int result;
		result=(~n)+1;
		System.out.println(result);
	}

}
