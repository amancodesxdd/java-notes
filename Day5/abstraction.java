public class abstraction {
    public static void main(String[] args) {
        
    
    pizza p1 = new pizza();
    pasta p2 = new pasta();

    p1.prepare();
    p1.deliver();

    p2.prepare();
    p2.deliver();
    }
}

abstract class FoodItem{

    abstract void prepare();

    void deliver(){
        System.out.println("Your food is on the way!");
    }
}

class pizza extends FoodItem{
    @Override
    void prepare(){
        System.out.println("Kneed dough, add sauce, bake at 200C");
    }

}

class pasta extends FoodItem{
    @Override
    void prepare(){
        System.out.println("Boil water, cook pasta, add sauce");
    }

}

