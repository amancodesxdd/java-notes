package Day3;

public class strings {
    public static void main(String[] args) {
        String name = "Bhole Chature";


        // Length of a String
        System.out.println("Length: "+ name.length());

        // Character at index
        System.out.println("Character at index 1: " + name.charAt(1));

        // Check if contains
        System.out.println("Contains Bhole ?: "+ name.contains("Bhole"));
        
        // Convert to uppercase/lowercase
        System.out.println("Uppercase: "+ name.toUpperCase());
        System.out.println("Lowercase: "+ name.toLowerCase());

        //Split String
        String[] parts = name.split(" ");
        System.out.println("First Part: "+ parts[0]);
        System.out.println("Last Part: "+ parts[1]);
    }   
}
