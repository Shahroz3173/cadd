public class jul12_oops {
    public static void main(String[] args) {
        mysha obj = new mysha();
        obj.x = 5;
        int y = obj.x;
//        obj.mymethod();
//        System.out.println();
        System.out.println(obj.x);
    }

}
class mysha {
    int x;
    public void mymethod(){
        System.out.println("hello beautiful");
    }

}
