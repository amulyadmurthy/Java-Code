package InterviewPrep;

public class Solution {

    public static boolean isPalindrome(String s)
    {
        for(int i=0,j=s.length()-1; i<=j; i++,j--)
        {
            if(s.charAt(i)!=s.charAt(j))
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String str="madam";

        if(isPalindrome(str))
        {
            System.out.printf("is pal");
        }
        else {
            System.out.printf("is not pal");
        }
    }
}
