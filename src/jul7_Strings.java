import java.io.*;

public class jul7_Strings {
    public static void main(String[] args) {
//        String str = "shahroz ali ";
//        String str1= "DEMON SLAYER";
//        System.out.println(str1);
//        System.out.println(str);
//
//        String STR = "SHAHROZ"+" "+"ALI";
//        System.out.println(STR);
//        System.out.println(str.toLowerCase());
//        System.out.println(str.toUpperCase());

        StringBuilder str = new StringBuilder("Shahroz");
        System.out.println(str);
        str.append(" Ali");
        System.out.println(str);
//        str.insert(8,"er");
//        System.out.println(str);
//        str.replace(5 ,7,"456");
//        System.out.println(str.toString());
//        System.out.println(str.length());
//        System.out.println(str.length());
//        str.delete(5,7);
//        System.out.println(str);
//        int capacity = str.capacity();
//        System.out.println(capacity);
//        str.reverse();
//        System.out.println(str);
//        int index = str.lastIndexOf("Ali");
//        System.out.println(index);

//        char a = str.setCharAt(12, 'l');
//        System.out.println(a);

        str.setCharAt(5,'W');
        System.out.println(str);

        StringBuilder str1 = new StringBuilder("hellobeautiful");
      // str1.setLength(10);
        str1.ensureCapacity(100);
        int capacity = str1.capacity();
        System.out.println(capacity);

//        System.out.println(str1);








    }
}
