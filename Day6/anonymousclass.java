package Day6;
import java.util.*;
interface payment{
    void pay(double amount);
}


public class anonymousclass {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter payment amount: ");
        double amount = sc.nextDouble();
        sc.close();

        payment p = new payment() {
            @Override
            public void pay(double amount){
                System.out.println("Amount Paid:"+ amount);

                if(amount>5000){
                    System.out.println("Payment Successful with Cashback!");
                }
                else{
                    System.out.println("Payment Successful.");
                }
            }
        };
        p.pay(amount);
    }
     
}

