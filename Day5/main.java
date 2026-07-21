import java.lang.invoke.StringConcatFactory;

class student3{
    String name;
    int roll;
    static String college = "SIT";

student3(String name, int roll){
    this.name = name;
    this.roll = roll;
}
void display(){
    System.out.println("Student: "+ name + "Roll: "+ roll+ "College: "+ college);
}

}

class ObjectCounter{
    static int count = 0;

    ObjectCounter(){
        count++;
    }

    static void count(){
        System.out.println("Total: "+ count);
    }
}

class varcheck{
    int num;;
    static int num2 = 200;

    varcheck(int num){
        this.num = num;
    }

    void printvar(){
        System.out.println(num);
        System.out.println(num2);
    }

}
class static1{
    String name;
    static String college = "SIT";
    
        static1(String name){
            this.name = name;
        }
        void display(){
            System.out.println("Name: "+ name+ "College: "+ college);
        }
}

class hello{
    static void greet(){
        System.out.println("Hello GENG!");
    }
}



public class main{
    public static void main(String[] args) {
        static1 s1 = new static1("Rose");
        static1 s2 = new static1("Pose");

        

        s1.display();
        s2.display();
        s1.college = "IIT";
        System.out.println("After changing:");

        s1.display();
        s2.display();

        hello.greet();

}
}
