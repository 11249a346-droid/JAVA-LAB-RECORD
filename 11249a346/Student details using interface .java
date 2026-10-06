interface Student {
    void displayDetails();
}

class StudentDetails implements Student {

    public void displayDetails() {
        System.out.println("----- Student Details -----");
        System.out.println("Student Name : Arun");
        System.out.println("Student ID   : 101");
        System.out.println("Department   : Computer Science");
        System.out.println("Year         : II");
        System.out.println("Age          : 19");
    }
}

public class Main {
    public static void main(String[] args) {

        StudentDetails student = new StudentDetails();
        student.displayDetails();
    }
}
