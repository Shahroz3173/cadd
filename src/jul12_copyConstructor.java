class copycons{
    String NAME;
    int age;
    String ADD;

    public copycons(String NAME, int age, String ADD){
        this.NAME = NAME;
        this.age = age;
        this.ADD= ADD;


    }
    public copycons(copycons car){
        this.NAME = car.NAME;
        this.age = car.age;
        this.ADD= car.ADD;
    }


}

public class jul12_copyConstructor {
    public static void main(String[] args) {
        copycons car= new copycons("bmw",10,"dmdm");
        copycons car1= new copycons(car);
        System.out.println(car.NAME);
        System.out.println(car1.NAME);

    }
}
