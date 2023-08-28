package InterviewPrep;

public class BinarySearch {


    public int BinarySearch(int[] arr, int l, int r, int target) {

        int n = 0;
        {
            int ArrayIndexOutOfBoundsException = -1;
            if (l > r)
                return ArrayIndexOutOfBoundsException;
            n = (l + (r - 1)) / 2;
            if (target == arr[n])
                return n;
            else if (target > arr[n])
                return BinarySearch(arr, n + 1, r, target);
            else
                return BinarySearch(arr, l, n - 1, target);



            }
        }




    public int BinarySearch1(int[] arr, int l, int r, int target) {
        if (l > r)
            return 0;
        int m = l+((r-l)/2);
        if (arr[m] == target)
            return m;
        else if (arr[m] > target)
            return BinarySearch(arr, l, m-1, target);
        else
            return BinarySearch(arr, m+1, r, target);
    }

    public static void main(String args[]) throws IndexOutOfBoundsException
    {
        int arr[]={1,2,3,4,5};
        int n=arr.length;
        int k=1;
        int result;

        BinarySearch ob= new BinarySearch();
        result=ob.BinarySearch(arr,0,n,k);

        {
            if(result==-1)

            {
                System.out.printf("element is not present");
            }
            else {
                System.out.printf("element is present at index"+result);
            }



        }
    }
}
