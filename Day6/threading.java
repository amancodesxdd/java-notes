public class threading{
public static void main(String[] args) {
    thread1 t1 = new thread1();
    t1.start();
    Thread t2 = new Thread(new thread2());
    t2.start(); 
}
}
class thread1 extends Thread{
    public void run(){
        for(int i=0;i <= 10; i ++){
            System.out.println(i);

            try{
                thread1.sleep(1000);
            }
            catch(InterruptedException e){
                System.out.println("Threading Interrupted!");
            }
        }
    }
}

class thread2 implements Runnable{
    public void run(){
        for(int i=0;i <= 10; i ++){
            System.out.println("Rose");

            try{
                thread1.sleep(1000);
            }
            catch(InterruptedException e){
                System.out.println("Threading Interrupted!");
            }
        }
    }
}