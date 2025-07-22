import java.util.ArrayList;
import java.util.Collection;

public class jul21_linearDataStructures {
    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        arrList.add(1);
        arrList.add(2);
        arrList.add(3);
        arrList.add(4);
        System.out.println(arrList);
        System.out.println(arrList.size());
        System.out.println(arrList.get(0));
        arrList.remove(3);
        System.out.println(arrList);
        arrList.clear();
        System.out.println(arrList);
        System.out.println(arrList.isEmpty());




    }

}
