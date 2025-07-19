public class jul14_inheritance {
    public static void main(String[] args) {
        UTU utu = new UTU();
        System.out.println(UTU.fee_structure);

        shivalik college = new shivalik();
        System.out.println(college.x);

    }
}

class UTU {
    static int fee_structure = 55000;

}

class shivalik extends UTU {
    int x = 45;

}
