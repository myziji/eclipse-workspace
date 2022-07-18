package xuexie;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//thread life cycle
//1. instance( create a thread)
//2. runnable(ready to run)
//3. running (execute the thread)
//4. waiting (waiting area and for waiting)
//5. terminal(the thread is finished/dead)


// start creates a new thread while the run doesn't create any thread and simply executes in the current thread like a normal method call
// wait is called the on object, sleep is called on thread
//sleep(it is static) is used to pause the process, wait is let thread goes in waiting state and it will not come back until call the notify() or notifyAll();
// if you want wake up the sleeping threead you can let another thread calls t.interrupt();
//3.2. Synchronized
//wait() ¨C when synchronized multiple threads access same Object one by one.
//sleep() ¨C when synchronized multiple threads wait for sleep over of sleeping thread.
//While sleep() is a static method which means that it always affects the current thread (the one that is executing the sleep method). A common mistake is to call t.sleep() where t is a different thread; even then, it is the current thread that will sleep, not the t thread.

//A yielding thread tells the virtual machine that it¡¯s willing to let other threads be scheduled in its place
//Note that it¡¯s only a hint, though, and not guaranteed to have any effect at all.




// implements Runnable
//public  class thread implements Runnable {
//	
//	@Override
//	public void run() {
//		System.out.println("class thread implements runnable");
//	}
//	
//
//	public static void main(String[] args) {
//		thread t = new thread();
//		t.run();
//		
//	}
//}


//	extends Thread 
public  class thread implements Runnable   {
	@Override
	public void run() {
		for(int i=0;i<=5;i++) {
			  Date d = new Date();
              SimpleDateFormat ft = new SimpleDateFormat("hh:mm:ss");
              System.out.println("Executing Time for"
                      + " task name - " + i +" ----" + 1 +" = " +ft.format(d) );  
              
              
              try {
				Thread.sleep(1000);
				
			} catch (InterruptedException e) {
			}
		}    
		}


	public static void main(String[] args) throws InterruptedException {
		thread t = new thread();
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		ThreadMXBean t3 = ManagementFactory.getThreadMXBean();
		for(int i=0;i<5;i++) {
			t1.start();
			t1.join();
			t1.interrupt();
			t2.start();
		
		}
		
		
	}
}





//public  class thread   implements Runnable{
//
//	private String name;
//	public thread(String s) {
//		this.name = s;
//	}
//	
//	@Override
//	public void run() {
//		for(int i=0;i<=5;i++) {
//			  Date d = new Date();
//              SimpleDateFormat ft = new SimpleDateFormat("hh:mm:ss");
//              System.out.println("Executing Time for"
//                      + " task name - " + i +" ----" + name +" = " +ft.format(d) );  
//              
//              
//              try {
//				Thread.sleep(1000);
//				
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//             
//		}
//	}
//
//
//	public static void main(String[] args) {
//		Runnable r1 = new thread("task 1");
//        Runnable r2 = new thread("task 2");
//        Runnable r3 = new thread("task 3");
//        Runnable r4 = new thread("task 4");
//        Runnable r5 = new thread("task 5");
//       // ExecutorService pool = Executors.newFixedThreadPool(3);  // Creates a fixed size thread pool
//       // ExecutorService pool = Executors.newCachedThreadPool();  // Creates  new threads as needed,but will reuse prrviously threads when they are available 
//        ExecutorService pool = Executors.newSingleThreadExecutor();// Creates a single thread
//        pool.execute(r1);
//        r1.notify();
//        try {
//			r1.wait(1000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//        pool.execute(r2);
//        pool.execute(r3);
//        pool.execute(r4);
//        pool.execute(r5);
//        pool.shutdown();
//	}
//
//
//
//}



