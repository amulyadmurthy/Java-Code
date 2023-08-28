package InterviewPrep;

import java.util.ArrayList;

public class ReverseArray {

        public void reverseArray(ArrayList<Integer> arr, int n, int k) {
            for (int i = 0; i+k < n; i+=k) {
                reverse(arr, i, i + k);
            }
          }

        public void reverse(ArrayList<Integer> arrayList, int l, int r) {
            while (l < r) {
                int temp = arrayList.get(l);
                arrayList.set(l, arrayList.get(r));
                arrayList.set(r, temp);
                l++;
                r--;
            }
        }

        public static void main(String args[])
        {
            ArrayList<Integer> arr= new ArrayList<Integer>();
            arr.add(10);
            arr.add(15);
            arr.add(20);
            arr.add(25);
            arr.add(30);
            arr.add(35);


            int n;
            int k=3;

            ReverseArray ar= new ReverseArray();
            ar.reverseArray(arr,arr.size(),k-1);
            System.out.println(arr);
            System.out.println("reversed array"+ar);


        }
}

