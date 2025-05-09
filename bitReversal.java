import java.util.*;
public class bitReversal {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
        int n = sc.nextInt(); 

        int reversed = reverseBits(n);
        System.out.println("Original: " + n + " -> " + Integer.toBinaryString(n)+" "+Integer.toBinaryString(n).length());
        System.out.println("Reversed: " + reversed + " -> " + Integer.toBinaryString(reversed)+ " "+Integer.toBinaryString(reversed).length());
    }

    public static int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result <<= 1;        
            result |= (n & 1);  
            n >>= 1;             
        }
        return result;
    }
}