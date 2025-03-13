class Pg17_Student {
    private int studentId;
    private String name;
    private double marks;

    public Pg17_Student(int studentId, String name, double marks) {
        this.studentId = studentId;
        this.name = name;
        this.marks = marks;
    }

    public void displayDetails() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }

    public boolean isPassed() {
        return marks >= 40;
    }

    public static void main(String[] args) {
        Pg17_Student student1 = new Pg17_Student(1, "Alice", 85);
        Pg17_Student student2 = new Pg17_Student(2, "Bob", 35);

        System.out.println("Student 1 Details:");
        student1.displayDetails();
        System.out.println("Passed: " + student1.isPassed());

        System.out.println("\nStudent 2 Details:");
        student2.displayDetails();
        System.out.println("Passed: " + student2.isPassed());
    }
}
