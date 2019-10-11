import java.util.Date;
class RunnableJob implements Runnable
{
	public void run()
	{
		Thread thread = Thread.currentThread();
		System.out.println("RunnableJob is being run by "+thread.getName()+" at "+ new Date());
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}
public class ThreadJoinExample1
{
	public static void main(String... s) throws InterruptedException
	{
		RunnableJob runnablejob = new RunnableJob();
		Thread t1 = new Thread(runnablejob,"1");
		Thread t2 =new Thread(runnablejob,"2");
		Thread t3 =new Thread(runnablejob,"3");
		Thread t4 =new Thread(runnablejob,"4");
		t1.start();
		t1.join();
		t2.start();
		t2.join();
		t3.start();
		t3.join();
		t4.start();
		t4.join();
		Thread t5= new Thread(runnablejob,"5");
		Thread t6 =new Thread(runnablejob,"6");
		Thread t7 =new Thread(runnablejob,"7");
		Thread t8 =new Thread(runnablejob,"8");
		t5.start();
		t6.start();
		t7.start();
		t8.start();
	}
}