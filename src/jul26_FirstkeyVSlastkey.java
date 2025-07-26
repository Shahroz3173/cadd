import java.util.*;

public class jul26_FirstkeyVSlastkey {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(10, "Ten");
        map.put(30, "Thirty");
        map.put(20, "Twenty");

        System.out.println("TreeMap: " + map);

        System.out.println("First Key: " + map.firstKey()); 
        System.out.println("Last Key: " + map.lastKey());

    }
}
