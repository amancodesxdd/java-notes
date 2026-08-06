
import java.io.*;
import java.util.*;

public class savename {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Step 1: Get name from user
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        
        try {
            // Step 2: Open name.txt for writing
            PrintWriter writer = new PrintWriter("name.txt");
            
            // Step 3: Write name to file
            writer.println(name);
            
            // Step 4: Close file
            writer.close();
            
            System.out.println("✅ Name saved to name.txt!");
            
        } catch (Exception e) {
            System.out.println("❌ Error: " + e.getMessage());
        }
    }
}