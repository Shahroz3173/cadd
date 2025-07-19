public class jul17_classAbstract {
    public static void main(String[] args) {
        animal dog = new Dogg("jacky");
        System.out.println("Dog's name: " + dog.getName());
        dog.sound();

        animal cat = new cat("Snowbell");
        System.out.println("Cat's name: " + cat.getName());
        cat.sound();

    }

}


abstract class animal{
    private String name ;

    public animal(String name) {
        this.name = name;
    }


    public abstract void sound();
    public String getName(){
        return name;
    }
}
class Dogg extends animal {
    public Dogg(String name){
        super(name);

    }

    @Override
    public void sound() {
        System.out.println("bhaww bhaww");
    }
}
class cat extends animal {
    public cat(String name){
        super(name);


    }

    @Override
    public void sound() {
        System.out.println("meow meow meow");
    }
}
