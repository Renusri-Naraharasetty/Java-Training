import java.util.*;
public class GenerateValidParentheses {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of parenteses to be generated :");
		int n=sc.nextInt();
		System.out.println("The valid parentheses are ");
		generated("",0,0,n);
	}
	public static void generated(String str,int open,int close,int max) {
		if(str.length()==max*2) {
			System.out.println(str);
			return;
		}
		if(open<max) {
			generated(str+ "{" ,open+1,close,max);
			
		}
		if(close<open) {
			generated(str+ "}",open,close+1,max);
		}
	}

}
