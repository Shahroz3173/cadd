import java.util.ArrayList;
import java.util.Arrays;

public class jul21_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        arr1.add(2);
        arr1.add(24);
        arr1.add(45);
        arr1.add(56);
        arr1.add(87);

        System.out.println("ArrayList: " + arr1);

        int max = findMaximum(arr1);
        System.out.println("Maximum element: " + max);


    }

    public static int findMaximum(ArrayList<Integer> list){
        int max = list.get(0);
        for (int i =1;  i < list.size(); i++){
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        return max;
    }


}
