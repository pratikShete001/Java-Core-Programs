class MyTasks implements Runnable{
	public void run()
	{
		try
		{
			Thread.sleep(200);
			System.out.println("Thread is running...");
		}
		catch(Exception e)
		{
		}
	}
}
class ThreadStates2
{
	public static void main(String args[])
	{
		MyTasks task = new MyTasks();
		Thread t1 = new Thread(task);
		//State after creration
		System.out.println("State after creation "+t1.getState());
		
		t1.start();
		System.out.println("State after calling start() "+t1.getState());
		
		try{
		Thread.sleep(3000);
		
		// Timed_waiting state(inside thread.sleep
		System.out.println("States during sleep() "+t1.getState());
		t1.join();
		}
		catch(Exception e)
		{
			e.getMessage();
		}
		// wait for the worker thread to finish completely
		
		System.out.println("State after execution finishes: "+t1.getState());
	}
}
