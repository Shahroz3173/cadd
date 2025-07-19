class Car {
    String model;
    String name;
    double average;
    int year;

    public Car() {
        this.model = "2024 BRABUS ";
        this.name = "BMW M4 CS";
        this.average = 9.4;
        this.year = 2025;
    }

    public Car(String model, String name, double average, int year) {
        this.model = model;
        this.name = name;
        this.average = average;
        this.year = year;
    }

    public void displayDetails() {
        System.out.println("Car Model: " + model);
        System.out.println("Car Name: " + name);
        System.out.println("Fuel Average: " + average + " km/l");
        System.out.println("Manufacture Year: " + year);
    }

}

public class jul12_car {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.displayDetails();

        System.out.println();

        Car car2 = new Car("Tesla Model 3", "Tesla", 15.0, 2023);
        car2.displayDetails();


    }

}

