public class jul21_ExceptionHanling {

    public static int divide(int x, int y) {
        if (y == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return x / y;
    }

    public static void main(String[] args) {
//        try{
//            int x = 10/0;
//            System.out.println(x);
//
//        }catch (Exception e){
//            System.out.println("shows an arithmatic exception ");
//        }finally {
//            System.out.println("hy i am beautiful");
//        }
//        divide(20,10),

        try {
            int ans = divide(20, 0);
            System.out.println("Result: " + ans);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("hy i am beautiful");
        }


    }
}
