import java.util.ArrayList;
import java.util.HashSet;

public class jul23_removeDuplicate {
    public static void main(String[] args) {
        ArrayList <Integer> arr1 = new ArrayList<>();
        arr1.add(12);
        arr1.add(13);
        arr1.add(14);
        arr1.add(13);
        arr1.add(14);
        arr1.add(15);

        System.out.println("Array list : " + arr1);
        System.out.println();

        HashSet<Integer> set = new HashSet<>(arr1);

        ArrayList<Integer> arr2 = new ArrayList<>(set);
        System.out.println("removed duplicate element ffrom array list : " + arr2);
    }
}
