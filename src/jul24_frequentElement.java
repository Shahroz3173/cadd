import java.util.*;
public class jul24_frequentElement {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 3, 4, 3, 2};

        HashMap<Integer, Integer> map = new HashMap<>();

        // Step 1: har nunber ko count karega
        for (int num : arr) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
// ab yaha pe maximum count ko dekhega or last me if check karega ki vo last wale se jada ho

        int maxCount = 0;
        int mostFrequent = -1;

        for (int key : map.keySet()) {
            if (map.get(key) > maxCount) {
                maxCount = map.get(key);
                mostFrequent = key;
            }
        }

        System.out.println("Most frequent element is: " + mostFrequent);
    }
}
