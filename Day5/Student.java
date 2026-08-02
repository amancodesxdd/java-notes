public class Student{
    String name;
    int roll;
    double marks;

    Student(){
    name = "Unknown";
    roll = 21;
    marks = 0.0;
}
    Student(String name,int roll,double marks){
        this.name = name;
        this.roll = roll;
        this.marks = marks;
    }

    void display(){
        System.out.println(name);
        System.out.println(roll);
        System.out.println(marks);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Rose",03,83.5);

        s1.display();
        s2.display();
    }

} 