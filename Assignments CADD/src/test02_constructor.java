class Student {
    String name;
    int age;


    Student() {
        System.out.println("Default Constructor Called");
        name = "Unknown";
        age = 0;
    }


    Student(String name, int age) {
        System.out.println("Parameterized Constructor Called");
        this.name = name;
        this.age = age;
    }
    Student(Student s) {
        System.out.println("Copy Constructor Called");
        this.name = s.name;
        this.age = s.age;
    }


    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class test02_constructor {
    public static void main(String[] args) {

        Student student1 = new Student();
        student1.display();

        Student student2 = new Student("Ankit", 22);
        student2.display();

        Student student3 = new Student(student2);
        student3.display();
    }

}
