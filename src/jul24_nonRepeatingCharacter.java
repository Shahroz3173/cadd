
import java.util.*;
public class jul24_nonRepeatingCharacter {
    public static void main(String[] args) {
        String str = "aabbcde";
        HashMap<Character, Integer> map = new HashMap<>();
        // Pehle sab characters ke count store karo
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        // Ab pehla character dhoondo jiska count 1 hai
        for (int i = 0; i < str.length(); i++) {
                    char ch = str.charAt(i);
                    if (map.get(ch) == 1) {
                        System.out.println("First non-repeating character is: " + ch);
                        return;
                    }
        }

        System.out.println("No non-repeating character found.");



    }
}
