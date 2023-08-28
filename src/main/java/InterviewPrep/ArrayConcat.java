package InterviewPrep;

import java.util.Arrays;

public class ArrayConcat {

    public static int[] arrayConcat(int[] nums)
    {
        int[] ans=new int[nums.length*2];
        for(int i=0; i< nums.length*2; i++)
        {

            if(i<nums.length) {
                ans[i] = nums[i];
            }
            else {
                ans[i]=nums[i-nums.length];
            }
        }
        return ans;
    }

    public static void main(String[] args)
    {
        int[] nums={1,2,3};
        System.out.println("concat num,bers are" + Arrays.toString(arrayConcat(nums)));
    }
}







