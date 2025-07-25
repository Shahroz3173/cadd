import java.util.ArrayList;
import java.util.Iterator;

public class jul24_itrators {
    public static void main(String[] args) {
        ArrayList <Integer> arr = new ArrayList<>();
        arr.add(13);
        arr.add(34);
        arr.add(45);
        arr.add(56);
        arr.add(67);
        arr.add(78);
        arr.add(89);

        System.out.println(arr);

        Iterator<Integer> itrator = arr.iterator();
        while (itrator.hasNext()){
            int number = itrator.next();
            System.out.println();

        }
    }
}
