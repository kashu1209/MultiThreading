package Synchronization;

class counter{
	
	int count;
	
	public synchronized void increment() {
		count++;
	}
	
}


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		counter c = new counter();
		
		Thread t1 = new Thread(()->{			//using lambda expression without variable
			for(int i=0;i<
					1000;i++) {
				c.increment();
									//will also work 
			}						// t3 = new Thread();
			});
		Thread t2 = new Thread(()->{			//using lambda expression without variable
			for(int i=0;i<1000;i++) {
				c.increment();
									//will also work 
			}						// t3 = new Thread();
			});
		Thread t3 = new Thread(()->{			//using lambda expression without variable
			for(int i=0;i<1000;i++) {
				c.increment();
									//will also work 
			}						// t3 = new Thread();
			});
		Thread t4 = new Thread(()->{			//using lambda expression without variable
			for(int i=0;i<1000;i++) {
				c.increment();
									//will also work 
			}						// t3 = new Thread();
			});
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		while(t1.isAlive() || t2.isAlive() || t3.isAlive() || t4.isAlive()) {}
		System.out.println(c.count);

	}

}
