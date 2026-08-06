
import java.io.*;

public class inpout {
    public static void main(String[] args) {
        try{
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\USER\\OneDrive\\Desktop\\javaxy\\Day5\\input.txt"));

            PrintWriter writer = new PrintWriter("C:\\Users\\USER\\OneDrive\\Desktop\\javaxy\\Day5\\output.txt");

            String line;
            while((line = reader.readLine()) != null){
                writer.println(line);
            }

            reader.close();
            writer.close();

            System.out.println("file copied succesfully!!!");
        }
        catch(Exception e){
            System.out.println("ERROR");
        }
    }
}

