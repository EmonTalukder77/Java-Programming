class Student {
    private int rollNo;
    private String name;
    private double marks;

    public Student(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void displayInfo() {
        System.out.println("Roll No: " + rollNo + ", Name: " + name + ", Marks: " + marks);
    }
}