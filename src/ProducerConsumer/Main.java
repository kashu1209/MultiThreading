package ProducerConsumer;


class Q{
	int num;
	boolean valueSet= false;
	public synchronized void put(int num) {
		
		while(valueSet) {
			try {wait();}catch(Exception e) {}
		}
			
		System.out.println("PUT : "+num);
		this.num=num;
		valueSet= true;
		notify();
	}

	public synchronized void get() {
		while(!valueSet) {
			try {wait();}catch(Exception e) {}
		}
		System.out.println("GET : "+num);
		valueSet = false;
		notify();
	}
	
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q q = new Q();
		new Producer(q);
		new Consumer(q);	
	}
}