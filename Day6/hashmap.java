

import java.util.HashMap;

public class hashmap {
    public static void main(String[] args) {
        HashMap<String,Integer> students = new HashMap<>();
        students.put("Bhondu",12);
        students.put("Chomu",13);
        students.put("Chandu",14);
        students.put("Dampu",15);
        students.put("Rose",16);


        System.out.println("Keys: " + students.keySet());
        System.out.println("Values: " + students.values());
        System.out.println("Contains Dampu?: " + students.containsKey("Dampu"));
        students.remove("Bob");
        System.out.println("Size: " + students.size());

    }   
    
}
