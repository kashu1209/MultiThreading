package ProducerConsumer;

public class Consumer implements Runnable {

	Q q;

	public Consumer(Q q) {
		this.q = q;
		Thread t = new Thread(this,"Consumer");//initialising thread with name producer
		t.start();
	}
	public void run() {
		while(true) {
			q.get();
			try {Thread.sleep(1500);}catch(Exception e) {}
		}
	}
	
	
}
