public class jul11_recursionReverseAsrting {

    public static void main(String[] args) {
        System.out.println(reverseString("Hello beautiful"));
//        String he = "hello pappu";
//        he.substring(3,5);
//        System.out.println(he);

    }
    public static String reverseString(String str){
        if (str.isEmpty()){
            return str;
        }else{
            return reverseString(str.substring(1))+str.charAt(0);
        }

    }
}
