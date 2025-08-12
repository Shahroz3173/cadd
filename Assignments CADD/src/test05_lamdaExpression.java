public class test05_lamdaExpression {
    public static void main(String[] args) {
        MyFunctionalInterface sayHello = () -> System.out.println("Hello from Lambda!");
        sayHello.say();
    }
}

@FunctionalInterface
interface MyFunctionalInterface {
    void say();
}
