package Interfaces;

import org.apache.commons.math3.analysis.function.Add;

import java.util.Arrays;

public class Recursion {

public static int sumRecur(int[] x)
{
    int c= 0;
    int result=0;
    for(int i=1 ;i < x.length ;i++)
    {

         c =(x[i]-1)+x[i];
         result = c + x[i];
    }


    return result;
}

    public static void main(String[] args) {
        int[] x={10,20,30,40,50,60,70};
        System.out.println("sum is" + Arrays.toString(new int[]{sumRecur(x)}));
    }

}
