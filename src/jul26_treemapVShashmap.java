
import java.util.*;

public class jul26_treemapVShashmap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Banana", 2);
        hashMap.put("Apple", 5);
        hashMap.put("Mango", 3);
        System.out.println("HashMap : " + hashMap);

        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Banana", 2);
        treeMap.put("Apple", 5);
        treeMap.put("Mango", 3);
        System.out.println("TreeMap (Sorted): " + treeMap);



    }
}

//tree map is a sortrd tree it is used when we need sorted data and hash map where we need faster implimentation
