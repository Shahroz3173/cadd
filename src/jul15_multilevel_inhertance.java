class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    void makeSound (){
        System.out.println("cat meow");
    }
}

class Pitbull extends Dog {
    void makeSound() {
        System.out.println("Pitbull growls loudly");
    }
}


class Pug extends Dog {
    void makeSound() {
        System.out.println("Pug barks softly");
    }
}

class PersianCat extends Cat {
    void makeSound() {
        System.out.println("Persian Cats are small and So cute ");
    }
}

class Jaiguar extends Cat {
    void makeSound() {
        System.out.println("Jaiguar roar");
    }
}

public class jul15_multilevel_inhertance {
    public static void main(String[] args) {
        Animal a = new Animal();
        Dog d = new Dog();
        Cat c = new Cat();
        Pitbull pb = new Pitbull();
        Pug pg = new Pug();
        PersianCat pc = new PersianCat();
        Jaiguar Jg = new Jaiguar();

        System.out.println(" Animal ");
        a.makeSound();

        System.out.println(" Dog ");
        d.makeSound();

        System.out.println(" Cat ");
        c.makeSound();

        System.out.println(" Pitbull ");
        pb.makeSound();

        System.out.println(" Pug ");
        pg.makeSound();

        System.out.println(" Persian Cat ");
        pc.makeSound();

        System.out.println(" JAIGUAR ");
        Jg.makeSound();

    }
}
