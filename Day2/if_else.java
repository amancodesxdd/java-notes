import java.util.*;
public class if_else {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks: ");
        int marks = sc.nextInt();
        

        if (marks>=90){
            System.out.println("Grade: A");
        }else if (marks>=75) {
            System.out.println("Grade: B");
        }else if (marks>=50){
            System.out.println("Grade: C");
        }else{
            System.out.println("FAILED!");
        }
    }
}
