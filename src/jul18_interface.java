public class jul18_interface {
    public static void main(String[] args) {
        CIRCLE circle = new CIRCLE(2.5);
        System.out.println(circle.area());
        System.out.println(circle.parameter());
        System.out.println(circle.printdetails());

    }
}
interface shape{
    double area();
    double parameter();
     default Object printdetails() {
        System.out.println("shape details : ");

         return null;
     }
}

class CIRCLE implements shape{
    private double radius;

    public CIRCLE(double radius) {
        this.radius = radius;
    }

    public double area(){
            return Math.PI * radius * radius;
    }

    @Override
    public double parameter() {
        return 2 * Math.PI * radius;
    }




}


