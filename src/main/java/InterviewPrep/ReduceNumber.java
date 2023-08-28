package InterviewPrep;

public class ReduceNumber {

    public static int reduceNum(int n)
    {

        if(n%2==0)
        {
            return n/2;
        }
        else if(n/2!=0)
        {
            return n-1;
        }


        return n;
    }

    public static void main(String[] args)
    {
        int n=7;
        System.out.println("num is"+reduceNum(n));
    }
}
