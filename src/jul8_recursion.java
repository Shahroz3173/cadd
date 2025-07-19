public class jul8_recursion {

//    public static int factorial(int n ){
//        if(n==0){
//            return 1;
//
//        }
//        else {
//            return n * factorial(n-1);
//        }
//    }

    public static int Sum(int n ){
        if(n==1){
            return 1;

        }
        else {
            return n + Sum(n-1);
        }
    }
    public static void main(String[] args) {
        int fact = Sum(6);
        System.out.println(fact);

    }
}
