import java.util.*;
public class validparantheses {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Stack<Character> stack=new Stack<>();
		String s=sc.nextLine();
		
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c=='(') {
				stack.push(')');
			}
			else if(c=='{'){
				stack.push('}');
			}
			else if(c=='[') {
				stack.push(']');
			}
			else {
				if(stack.isEmpty()||stack.pop()!=c) {
					System.out.println("Not valid!!");
					break;
				}
			}
		}
		if(!stack.isEmpty()) {
			System.out.println("Not valid!!");
		}
		else {
			System.out.println("Valid parantheses!");
		}
	}

}
