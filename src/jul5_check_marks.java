public class jul5_check_marks {
    public static void main(String[] args) {
        System.out.println("perfomence  checker");
        int marks = 23;


        if (marks >= 90 && marks <= 100) {
            System.out.println("Excellent");
        } else if (marks >= 80 && marks < 90) {
            System.out.println("Very Good");
        } else if (marks >= 70 && marks < 80) {
            System.out.println("Good");
        } else if (marks >= 60 && marks < 70) {
            System.out.println("Average");
        } else if (marks >= 0 && marks < 60) {
            System.out.println("fail hai be tu padh le ");
        } else {
            System.out.println("Invalid Marks");
        }

    }
}
