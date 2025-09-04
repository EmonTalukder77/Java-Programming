import java.util.ArrayList;

class StudentManagerList {
    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student s) {
        students.add(s);
        System.out.println("Student added successfully!");
    }

    public void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }
        System.out.println("\n--- Student Records ---");
        for (Student s : students) {
            s.displayInfo();
        }
    }

    public void searchStudent(int rollNo) {
        for (Student s : students) {
            if (s.getRollNo() == rollNo) {
                System.out.println("Student found:");
                s.displayInfo();
                return;
            }
        }
        System.out.println("Student with Roll No " + rollNo + " not found.");
    }
}