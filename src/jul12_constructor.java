public class jul12_constructor {
    public static void main(String[] args) {
        Ali myobj = new Ali();
        Ali myobj1 = new Ali("aalu",14);
        System.out.println(myobj1.age );
        System.out.println(myobj1.name);


    }
}
class Ali{
    public Ali(){
        System.out.println("this is default constructor ");

    }
    String name;
    int age;
     public Ali( String name, int age ){
        this.name = name ;
        this.age = age ;


     }

}
