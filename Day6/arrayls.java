import java.util.ArrayList;

public class arrayls {
    public static void main(String[] args) {
      ArrayList<String> fruits = new ArrayList<>();

        fruits.add("apple");  
        fruits.add("banana");
        fruits.add("Kiwi");
        fruits.add("Guava");
        fruits.add("Strawberry");
        System.out.println(fruits);

        for (String f : fruits) {
            System.out.println(f);
        }
        
        
        fruits.remove(2);

        System.out.println("Contains apple?: "+ fruits.contains("apple"));

        System.out.println(fruits.size());


    }

    
    
}
