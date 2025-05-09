import java.util.*;
public class longestpossiblesubstring {
    static int lengthOfLongestSubstring(String s)
    {
        HashMap<Character,Integer> lastPos=new HashMap<>();
        int maxL=0;
        int left=0;
        for(int right=0;right<s.length();right++)
        {
            char curChar=s.charAt(right);
            if(lastPos.containsKey(curChar))
            left=Math.max(left,lastPos.get(curChar)+1);
            maxL=Math.max(maxL,right-left+1);
            lastPos.put(curChar,right);
        }
        return maxL;
    }
    static String LongestSubstring(String s)
    {
        HashMap<Character,Integer> lastPos=new HashMap<>();
        int maxL=0;
        int left=0,right,start=0;
        for(right=0;right<s.length();right++)
        {
            char curChar=s.charAt(right);
            if(lastPos.containsKey(curChar))
            left=Math.max(left,lastPos.get(curChar)+1);
            if(right-left+1>maxL)
            {
                maxL=right-left+1;
                start=left;
            }
            maxL=Math.max(maxL,right-left+1);
            lastPos.put(curChar,right);
        }
        return s.substring(start,start+maxL);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println("The length of longest substring without repeating characters in the given string is : "+lengthOfLongestSubstring(s));
        System.out.println("The longest substring without repeating characters in the given string is : "+LongestSubstring(s));
    }
}