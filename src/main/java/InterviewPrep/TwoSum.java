package InterviewPrep;

import java.util.Arrays;
import java.lang.Math.*;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (target == nums[i] + nums[j])
                    return new int[]{i,j};
            }
        }
        return new int[]{};
    }


public static void main(String[] args)
{

  int[] nums={2,7,11,15};
  int target = 13;
  TwoSum obj = new TwoSum();
  System.out.println(Arrays.toString(obj.twoSum(nums, target)));

}
}
