abstract class Animal {
    abstract void sound();
}
class Dog extends Animal {

    void sound() {
        System.out.println("Dog barks");
    }
}
class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}


public class Test02_AbstractionEncapsulation {
    public static void main(String[] args) {

        Animal myDog = new Dog();
        myDog.sound();  // Dog barks

        Person person = new Person();
        person.setName("Motu Ankit");
        System.out.println("Person's name is: " + person.getName());
    }

}
