public class jul8_MethodFunctions {
    public static void mymethod(){
        System.out.println("hello world");
    }
    static int myfunction(int a ,int b){
        return a+b;

    }
    int sum = myfunction(56,57);


    public static void main(String[] args) {
        System.out.println("welcome to methods/functions");
        mymethod();
        System.out.println(myfunction(12,45));
//        System.out.println();
        shahroz shObj = new shahroz();

        System.out.println(shObj.mymethod2(5));











    }

}
class shahroz {

    public int mymethod2 (int x ){
        return x + 5;
    }
}

