package InterviewPrep;

public class AdditionNumbers {

    public int additionNumbers(int a, int b, int c) {
        c = a + b;
        return c;

    }


    public static void main(String args[]) {

        int a = 10;
        int b = 30;
        int c=0;
        System.out.println();

        AdditionNumbers ad=new AdditionNumbers();

        System.out.println(ad.additionNumbers(a,b,c));



    }


}