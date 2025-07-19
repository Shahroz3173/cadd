public class jul18_ovveriding {
    public static void main(String[] args) {
        Shape shape = new Shape();


        double circleArea = shape.area(5.0);
        System.out.println("Area of Circle: " + circleArea);
        double squareArea = shape.area(4);
        System.out.println("Area of Square: " + squareArea);


        double rectangleArea = shape.area(5, 3);
        System.out.println("Area of Rectangle: " + rectangleArea);
    }

}
class Shape {


    public double area(double radius) {
        return Math.PI * radius * radius;
    }


    public double area(int side) {
        return side * side;
    }


    public double area(int length, int width) {
        return length * width;
    }
}
