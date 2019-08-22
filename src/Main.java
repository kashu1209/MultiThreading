
public class Main {
	public static void main(String[] args) throws Exception {
	
		Mythread1 a = new Mythread1(); //using interface runnable
		Mythread2 b = new Mythread2(); //using inheritence
		Runnable c = new Runnable() {  //using anonymous class
												
			public void run() {
				for(int i=0;i<3;i++) {
					System.out.println("iiiiiiiiiiiiiiiiiiii");
					try {
						Thread.sleep(800);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						//e.printStackTrace();
					}
				}
			}
			
		};
		Runnable d = ()->{			//using lambda expression	
			for(int i=0;i<3;i++) {
				System.out.println("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
				try {
					Thread.sleep(800);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					//e.printStackTrace();
				}					//will also work 
			}						
		};
		/* t3 = new Thread(()->{			//using lambda expression without variable
						for(int i=0;i<10;i++) {
							System.out.println("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
							try {
								Thread.sleep(800);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								//e.printStackTrace();
							}					//will also work 
						}						// t3 = new Thread();
						});
		 */
		
		
		Thread t1 = new Thread(a);	   //passing runnable a arguments
		Thread t2 = new Thread(c);     //to threads.
		Thread t3 = new Thread(d);
		
		printName(t1,t2,t3,b);
		
		
		
		
		t1.start();
		//try {Thread.sleep(10);}catch(Exception e){} //to print orderly else
		b.start();									//it will be random as both reaches
		//try {Thread.sleep(10);}catch(Exception e){}	//at the same time and will be
		t2.start();									//chosen randomly.
		//try {Thread.sleep(10);}catch(Exception e){}
		t3.start();
		
		t1.join();
		t2.join();
		t3.join();
		b.join();
//		while(t1.isAlive() || t2.isAlive() || t3.isAlive() || b.isAlive()) {}	
		//work same as joinas the loop will keepon going till they all are finished
		
		System.out.println("BYE");
	}

	private static void printName(Thread t1, Thread t2, Thread t3, Mythread2 b) {
		// TODO Auto-generated method stub
		t1.setName("t1");
		t2.setName("t2");
		t3.setName("t3");
		b.setName("b");
		t1.setPriority(10);  //starting from 1...10 i.e. least to highest
		b.setPriority(9);
		t2.setPriority(8);
		t3.setPriority(7);
		System.out.println(t1.getName()+" "+t1.getPriority());
		System.out.println(t2.getName()+" "+t2.getPriority());
		System.out.println(t3.getName()+" "+t3.getPriority());
		System.out.println(b.getName()+" "+b.getPriority());
		
	}
}
