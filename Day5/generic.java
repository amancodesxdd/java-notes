class box<T>{
    T name;

    void setValue(T value){
        this.name = value;
    }
    
    T getValue(){
        return name;
    }
}

class stu<T>{
    T ID;
    

    stu(T id){
        this.ID = id;
    }

    void display(){
        System.out.println(ID);
    }
}

public class generic{
    public static void main(String[] args) {
        box<Integer> b = new box<>();
        b.setValue(97);

        box<String> b1 = new box<>();
        b1.setValue("Rose");

        System.out.println(b.getValue());
        System.out.println(b1.getValue());



        stu<Integer> s1 = new stu<>(45);
        s1.display();

        stu<String> s2 = new stu<>("rose");
        s2.display();

        
    }
}