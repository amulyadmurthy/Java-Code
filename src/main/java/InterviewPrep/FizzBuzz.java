package InterviewPrep;

import java.util.*;

public class FizzBuzz {

    public static List<String> fizzBuzz(int n) {

        List<String> answer = new ArrayList<>(n);
        for (int i = 0; i <= n; i++) {
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBY5 = i % 5 == 0;

            if (divisibleBy3 && divisibleBY5) {
                answer.add("FIZZBUZZ");
            }
             else if (divisibleBY5) {
                    answer.add("BUZZ");
                } else if (divisibleBy3) {
                    answer.add("FIZZ");
                } else {
                    answer.add(String.valueOf(i));

                }

            }
            return answer;
        }

    public static void main(String[] args) {
        int n=15;
//        List<String> ns = new ArralistPractice<>(n);
//        ns.add(String.valueOf(10));
//        ns.add(String.valueOf(20));
//        ns.add(String.valueOf(3));
//        ns.add(String.valueOf(9));
//        ns.add(String.valueOf(4));
        System.out.println(fizzBuzz(n));
    }

}

