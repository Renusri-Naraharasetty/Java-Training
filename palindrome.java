import java.util.Scanner;
public class palindrome{
    public static boolean ispalindrome(int n){
        if(n<0||(n%10==0&n==0)){
            return false;
        }
        int reversed=0;
        while(n>reversed){
            int digit=n%10;
            reversed=reversed*10+digit;
            n/=10;
        }
        return n==reversed||n==reversed/10;
    }
    public static void main(String[] args){
    	Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        if(ispalindrome(n)){
            System.out.println(n+"is a palindrome");
        }
        else{
            System.out.println(n+" is not a palindrome");
        }
    }
}