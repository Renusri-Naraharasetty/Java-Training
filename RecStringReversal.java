import java.util.*;
public class RecStringReversal {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string :");
		String original=sc.nextLine();
		String reversed=reverse(original);
		System.out.println("Original String : "+original);
		System.out.println("Reversed string : "+reversed);
	}
	static String reverse(String str) {
		if(str.isEmpty()) {
			return str;
		}
		return reverse(str.substring(1))+str.charAt(0);
	}

}
