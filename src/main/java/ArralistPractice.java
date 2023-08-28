import java.util.ArrayList;
import java.util.Collections;

public class ArralistPractice {

    public static void main(String[] args) {

        ArrayList<String> myArray = new ArrayList<String>();
        myArray.add("Tesla");
        myArray.add("Alpha Ramiah");
        myArray.add("Subaru");
        System.out.println(myArray.get(1));
        System.out.println(myArray.set(2,"Swift"));
        System.out.println(myArray.size());
        myArray.remove(2);
        Collections.sort(myArray);
        System.out.println("List is" + myArray);



    }

}
