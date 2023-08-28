package InterviewPrep;

import lombok.Data;

import java.util.Arrays;

public class RunningSum {
    public int[] RunningSum(int[] arr)
    {
        for(int i = 1; i < arr.length; i++) {
            arr[i] += arr[i-1];
        }
    return arr;
    }

    public static void main(String args[])
    {
        int arr[]={1, 2, 3, 4};
        RunningSum rs=new RunningSum();
        rs.RunningSum(arr);
        System.out.println(Arrays.toString(arr));

    }
}
