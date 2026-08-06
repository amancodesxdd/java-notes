// Method 1: Extending Thread class
class HelloThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hello from Thread! (" + i + ")");
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted!");
            }
        }
    }
    
    public static void main(String[] args) {
        HelloThread thread = new HelloThread();
        thread.start(); // Start the thread
        System.out.println("Main thread continues...");
    }
}

// Method 2: Using Runnable (Better approach)
class HelloRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hello from Runnable! (" + i + ")");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted!");
            }
        }
    }
    
    public static void main(String[] args) {
        HelloRunnable runnable = new HelloRunnable();
        Thread thread = new Thread(runnable);
        thread.start();
    }
}

// package Day6;

// public class hellothread extends Thread {
//     @Override
//     public void run() {
//         for (int i = 1; i <= 5; i++) {
//             System.out.println("Hello from thread: (" + i + ")");
//             try{
//                 Thread.sleep(1000);
//             } catch(InterruptedException e){
//                 System.out.println("Thread Interrupted");
//             }
//         }
//     }


// public static void main(String[] args) {
//           hellothread thread = new hellothread();
//           thread.start();
//           System.out.println("Main thread continues...");
//       }
   
// public class HelloRunnable implements Runnable {
//     @Override
//     public void run() {
//         for (int i = 1; i <= 5; i++) {
//             System.out.println("Hello from Runnable! (" + i + "");
//             try {
//                 Thread.sleep(1000);
//             } catch (InterruptedException e) {
//                 System.out.println("Thread interrupted!");
//             }
//         }
//     }

//     public static void main(String[] args) {
//         hellorunnable runnable = new hellorunnable();
//         Thread thread = new Thread(runnable);
//         thread.start();
//         }
//     }

    
// }