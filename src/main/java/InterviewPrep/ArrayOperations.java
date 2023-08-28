package InterviewPrep;

public class ArrayOperations {

    public static int arrayOp(String[] operations) {
        int x = 0;
        for (int i = 0; i < operations.length; i++) {
            if (operations[i].charAt(1) == '+') {

                x++;

            } else {
                x--;
            }

        }
            return x;

    }


    public static void main(String[] args) {
        int x = 0;
        String[] operations={"++x","--x","x++","x--"};
        System.out.println("number is"+arrayOp(operations));
    }
}