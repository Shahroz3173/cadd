import java.util.Map;
import java.util.TreeMap;

public class jul26_treeMap {
    public static void main(String[] args) {
        TreeMap < Integer,String > treeMap = new TreeMap<>();
        treeMap.put(2,"rahul pandey" );
        treeMap.put(3,"amaan" );
        treeMap.put(4,"chandu");
        treeMap.put(5,"himanshu");
        treeMap.put(6,"harsh");
        treeMap.put(7,"aditya");
        treeMap.put(8,"shabaz");
        treeMap.put(9,"waris");
        System.out.println();

        System.out.println("TreeMap (Sorted): " );
        System.out.println("{employee ID , employee Name}");
        System.out.println(treeMap);

    }
}
