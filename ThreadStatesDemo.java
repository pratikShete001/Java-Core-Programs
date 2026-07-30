class MyThread extends Thread {
	
	public void run(){
		System.out.println(getName() +" is RUNNING");
		try{
			Thread.sleep(1000);
			synchronized(this){
				System.out.println(getName()+" got the lock");
				wait();
			}
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}
public class ThreadStatesDemo{
	public static void main(String args[]) throws InterruptedException
	{
		MyThread t1 = new MyThread();
		System.out.println("State after creation: "+t1.getState());
		
		t1.start();
		System.out.println("State while running: " +t1.getState());
		
		Thread.sleep(200);
		System.out.println("State while running: "+t1.getState());
		
		Thread.sleep(1500);
		System.out.println("States after wait(): "+t1.getState());
		
		synchronized (t1){
			t1.notify();
		}
		
		Thread.sleep(200);
		System.out.println("Final state: "+t1.getState());
	}
	
}