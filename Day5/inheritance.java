public class inheritance {
    public static void main(String[] args) {
        Car mycar = new Car();
        mycar.start();
    }
}

class Vehicle{
    void start(){
        System.out.println("The engine in started!");
    }
}

class Car extends Vehicle{

}

// class Person{
//     String name;
//     int age;

//     Person(String name,int age){
//         this.name = name;
//         this.age = age;
//     }
// }

// class stud extends Person{
//     int roll;

//     stud(String name,int age,int roll){
//         super(name,age);
//     }
// }