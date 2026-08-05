import java.util.*;

public class timertask {
    public static void main(String[] args) {
        Timer t = new Timer();
        TimerTask task = new TimerTask(){

            int count = 5;
        
            @Override
            public void run(){
                System.out.println("Time To go GYM!");
                count --;
                if(count <= 0){
                    t.cancel();
                }
            }
        };

        t.schedule(task,0,3000);
      
    }
    
}

