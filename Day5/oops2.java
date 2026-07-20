import java.util.*;

class Student1 {
    String name;
    int rollNo;
    double marks;

    Student1(String name, int rollNo, double marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    void display() {
        System.out.println("Name: " + name + " | Roll: " + rollNo + " | Marks: " + marks);
    }

    public static void main(String[] args) {
        Student1[] students = new Student1[5];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < students.length; i++) {
            System.out.println("\n--- Student " + (i + 1) + " ---");
            
            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Roll Number: ");
            int rollNo = Integer.parseInt(sc.nextLine());  // Convert String to int

            System.out.print("Enter Marks: ");
            double marks = Double.parseDouble(sc.nextLine());  // Convert String to double

            students[i] = new Student1(name, rollNo, marks);
        }

        System.out.println("\n--- All Students ---");
        for (int i = 0; i < students.length; i++) {
            students[i].display();
        }

        sc.close();
    }
}