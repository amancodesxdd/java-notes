package Day6;
import java.util.*;

public class countdowntimer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of seconds for timer: ");
        int response = sc.nextInt();

        Timer timer = new Timer();
        TimerTask task = new TimerTask(){

            int count = response;

            @Override
            public void run(){
                System.out.println(count);
                count --;
                if(count <= 0){
                    System.out.println("CONGRATSSSSS ON 8+ GPA !!!");
                    timer.cancel();
                }
                
            }
        };
        timer.scheduleAtFixedRate(task,0,1000);

    }
}


