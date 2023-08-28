package InterviewPrep;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayShuffle {

    public static int[] arrayShuffle(int[] nums,int n)
    {
        int[] result=new int[nums.length];
        int j=0;
        int k=n;
        for(int i=0;i<n*2;i++)
        {
            result[i]=nums[j++];

        }
        for (int i=1;i<n*2;i++)
        {
            result[i]=nums[k++];
        }
return result;
    }


    public static void main(String[] args) {
       int[] nums= new int[]{1, 2, 3, 4, 5, 6};
        int n=3;
        System.out.println("shuffled numbers are"+ Arrays.toString(arrayShuffle(nums,n)));
    }
}
