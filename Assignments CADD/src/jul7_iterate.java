public class jul7_iterate {
    public static void main(String[] args) {
        StringBuffer str1 = new StringBuffer("IamBeautifullShahroz");
        int length = str1.length();
        for (int i = 0; i<length; i++){
            char ch = str1.charAt(i);
            System.out.println(ch);
        }
    }
}
