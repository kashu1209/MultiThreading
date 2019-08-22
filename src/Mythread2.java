public class Mythread2 extends Thread{

	public void run() {
		for(int i=0;i<3;i++) {
			System.out.println("HHHHHHH");
			try {
				Thread.sleep(800);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
			}
		}
	}
	
	
}