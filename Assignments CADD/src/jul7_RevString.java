

public class jul7_RevString {
    public static void main(String[] args) {
        System.out.println("wellcome to reverse a string ");
        StringBuffer str = new StringBuffer("IamShahroz");
        String rev = "";
        int length = str.length();
        for(int i = length-1; i>=0; i--){
            rev = rev+str.charAt(i);
        }

        System.out.println(rev);

    }
}
