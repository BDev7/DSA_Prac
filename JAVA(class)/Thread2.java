class myThread1 implements Runnable
{
  public void run()
  {
	System.out.println("Thread is Running ");
  }
}

/**
 * ThreadDemo1
 */
 class ThreadDemo1 {

	public static void main(String[] args) {
		myThread1 obj=new myThread1();
		Thread t1=new Thread(obj);
          t1.start();// to call run method
		  t1.run();
		  obj.run();
		//   obj.start();
		
	}
	
}