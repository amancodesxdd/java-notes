package Day4;

public class function {
    // 1. Void method (No return)
    public static void greet() {
        System.out.println("Hello from POSE PABILIO RO");
    }
    // 2. Method with Parameters (No return)
    public static void greetPerson(String name) {
            System.out.println("Hello, "+ name + "!");
        }
    

    // 3. Method with return Type
    public static int add(int a,int b){
        return a + b;
    } 

    // 4. Method Overloading (Same name, diff parameters)

    public static double add(double a, double b){
        return a + b;
    }
    
    


public static void main(String[] args){

    // Calling the methods
    greet();

    greetPerson("Rose");

    int sum = add(5,3);
    System.out.println("Sum: " + sum);

    double doubleSum = add(2.5, 3.5);
    System.out.println(doubleSum);

    }

}