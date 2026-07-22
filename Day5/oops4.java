class Animal{
    String name;
    int age;

    Animal(String name,int age){
        this.name = name;
        this.age = age;
    }
    String getname(){
        return name;
    }
    int getage(){
        return age;

    }

    void makesound(){
        System.out.println("Some generic sound");
    }
}
class dog extends Animal{
    String breed;

    dog(String name,int age,String breed){
        super(name, age);
        this.breed = breed;
    }
        @Override
        void makesound(){
            System.out.println("Woof Woof!");
        }

        void fetch(){
            System.out.println(name + "is fetching");
        }


    }

class cat extends Animal{
    boolean isIndoor;


    cat(String name,int age,boolean isIndoor){
        super(name, age);
        this.isIndoor = isIndoor;
}
    @Override
    void makesound(){
        System.out.println("Meow Meow!");
    }
    void purr(){
        System.out.println(name+ "is purring");
    }
}


public class oops4 {
    public static void main(String[] args) {
        dog d1= new dog("Zoro",4,"Desi");
        cat c1 = new cat("Mo",4,true);

        System.out.println("DOG");
        System.out.println("Name: " + d1.getname());
        System.out.println("age: " + d1.getage());
        System.err.println("Breed: "+ d1.breed); 
        
        d1.makesound();
        d1.fetch();

        System.out.println();

         System.out.println("CAT");
        System.out.println("Name: " + c1.getname());
        System.out.println("age: " + c1.getage());
        System.err.println("Breed: "+ c1.isIndoor);

        c1.makesound();
        c1.purr();

        System.out.println();

        System.out.println("POLYMORPHISM");
        Animal[] animals = {d1,c1};
        for(Animal a: animals){
            a.makesound();
        }
    }

}
