import java.util.*;
public class userinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Enter Your Fav Food Item: ");
        String food = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("Hello " + name + " ! You are " + age + " years old and you love " + food + ".");

    }
}
