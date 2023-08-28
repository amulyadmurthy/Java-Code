package InterviewPrep;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GreatestCandies {

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int max = 0;

        for (int i = 0; i < candies.length; i++) {

            if (max < candies[i]) {
                max = candies[i];
            }
        }

            for (int i = 0; i < candies.length; i++) {

                if (candies[i] + extraCandies >= max) {
                    result.add(true);
                } else {
                    result.add(false);
                }
            }

        return result;
    }

    public static void main(String[] args) {

     int[] candies={2,8,7};
        int extraCandies=1;

        System.out.println("list is"+ kidsWithCandies(candies,extraCandies));
    }
}
