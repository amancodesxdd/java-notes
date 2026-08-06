public class threading{
public static void main(String[] args) {
    // thread1 t1 = new thread1();
    // t1.start();
    // Thread t2 = new Thread(new thread2());
    // t2.start(); 
    // thread3 t3 = new thread3();
    // t3.start();
    // thread4 t4 = new thread4();
    // t4.start();
    System.out.println(Thread.currentThread().getName());

    Thread.currentThread().setName("Main Worker");
    System.out.println(Thread.currentThread().getName());

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
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                System.out.println("Threading Interrupted!");
            }
        }
    }
}

class thread3 extends Thread{
    public void run(){
        for(int i=1;i <= 10; i +=2){
                System.out.println("Odd: "+ i);
            
            try{
                thread3.sleep(1000);
            }
            catch(InterruptedException e){
                System.out.println("Threading Interrupted!");
            }
        }
    }
}

class thread4 extends Thread{
    public void run(){
        for(int i=2;i <= 10; i +=2){
                System.out.println("Even: "+ i);
            try{
                thread4.sleep(1000);
            }
            catch(InterruptedException e){
                System.out.println("Threading Interrupted!");
            }
        }
    }
}

