import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class jul22_udatingAnArraylist {
    public static void main(String[] args) {
        //updating an arraylist
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(1);
        System.out.println(arr);
        arr.set(4,8);
        System.out.println(arr);

        for (int i : arr){
            System.out.println(i);
        }

        Collections.shuffle(arr);
        System.out.println(arr);

        Collections.sort(arr, Collections.reverseOrder());
        System.out.println("sorted srray in decending order : " + arr);

        int secondLargest = arr.get(arr.size() - 2);
        System.out.println("Second largest element: " + secondLargest);

        for (int i : arr){
            System.out.println(i);
        }


        System.out.println();
        int minimum = Collections.min(arr);
        System.out.println(minimum);





    }
}

