class College {
    String collegeName;

    College(String name) {
        this.collegeName = name;
    }

    void displayCollegeInfo() {
        System.out.println("Welcome to " + collegeName);
    }
}
class ViceChancellor extends College {
    ViceChancellor(String name) {
        super(name);
    }

    void manageCollege() {
        System.out.println("Vice Chancellor Ghadha hai.");
    }
}
class Dean extends College {
    Dean(String name) {
        super(name);
    }

    void overseeDepartments() {
        System.out.println("Dean toh hai hi nhi hamare pass.");
    }
}
class HOD extends College {
    String departmentName;

    HOD(String collegeName, String departmentName) {
        super(collegeName);
        this.departmentName = departmentName;
    }

    void manageDepartment() {
        System.out.println("HOD of " + departmentName + " manages the department.");
    }
}


public class test02_CollegeManagementSystem {
    public static void main(String[] args) {


        College college = new College("uttarakhand Technical University");
        college.displayCollegeInfo();

        ViceChancellor vc = new ViceChancellor("uttarakhand Technical University");
        vc.manageCollege();

        Dean dean = new Dean("uttarakhand Technical University");
        dean.overseeDepartments();

        HOD hodCS = new HOD("uttarakhand Technical University", "Computer Science");
        HOD hodEE = new HOD("uttarakhand Technical University", "Electrical Engineering");
        HOD hodME = new HOD("uttarakhand Technical University", "Mechanical Engineering");

        hodCS.manageDepartment();
        hodEE.manageDepartment();
        hodME.manageDepartment();
    }


}
