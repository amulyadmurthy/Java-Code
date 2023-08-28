package InterviewPrep;

import java.util.Arrays;

public class ArrayPermutation {
    private int[] nums;

    public ArrayPermutation(int[] nums) {
        this.nums = nums;
    }

    public int[] arrayBuild() {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++)
        {
            ans[i] = nums[nums[i]];

    }
        return ans;

    }

    public static void main(String[] args)
    {
        int[] nums={1,3,0,2};
       ArrayPermutation arr=new ArrayPermutation(nums);
        System.out.println("numbers are "+ Arrays.toString(arr.arrayBuild()));

    }
}
