package Day5;

class Student{
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

class Book{
    String title;
    String author;
    double price;


Book(){
    this.title = "Unknown";
    this.author = "Unknown";
    this.price = 0.0;
}
Book(String title,String author){
    this.title = title;
    this.author = author;
    this.price = 100.0;
}
Book(String title,String author,double price){
    this.title = title;
    this.author = author;
    this.price = price;
}
void display(){
    System.out.println(title);
    System.out.println(author);
    System.out.println(price);
}
public static void main(String[] args) {
    Book b1 = new Book();
    Book b2 = new Book("A Thousand Splendid Suns","Khalid Hosseini");
    Book b3 = new Book("The Idiot","Fyodor Dostoevysky",999);

    b1.display();
    b2.display();
    b3.display();
}
}

class employee{
    int id;
    String name;
    double salary;

employee(int id,String name,double salary){
    this.id = id;
    this.name = name;
    this.salary = salary;
}
employee(employee other){
    this.id = other.id;
    this.name = other.name;
    this.salary = other.salary;
}

void display(){
    System.out.println(id);
    System.out.println(name);
    System.out.println(salary);
}


public static void main(String[] args) {
    employee e1 = new employee(189,"Rose",5000000.0);
    employee e2 = new employee(e1);
    System.out.println("Employee Details:");
    e1.display();
    System.out.println("Copy of Employee Details");
    e2.display();
}
}