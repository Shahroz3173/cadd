class outer {
    private int x ;
    public void outer(){
        System.out.println("hello world");
    }
    static class myinner{ int y;
        static void myinner(){
            System.out.println("hello beautiful");
        }
    }
}

public class jul16_InnerClass {
    public static void main(String[] args) {
        outer myouter = new outer();
        outer.myinner inner = new outer.myinner();

        outer.myinner.myinner();

    }
}
