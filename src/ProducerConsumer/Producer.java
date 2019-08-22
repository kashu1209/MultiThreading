package ProducerConsumer;

public class Producer implements Runnable{
	
	Q q;

	public Producer(Q q) {
		this.q = q;
		Thread t = new Thread(this,"Producer");//initialising thread with name producer
		t.start();
	}
	public void run() {
		int i=0;
		while(true) {
			q.put(i++);
			try {Thread.sleep(400);}catch(Exception e) {}
		}
	}
}
