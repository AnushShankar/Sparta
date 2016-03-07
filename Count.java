package multiThreading;

public class Count extends Thread{
	
	public Count(){
		start();
	}
	
	public void run(){
		
		try{
			
			for(int i=0;i<10;i++){
			
			System.out.println("the no is " + i);
			Thread.sleep(1000);
			}
		}
		
		catch(InterruptedException e){
			System.out.println("myThread has been interrupted");
		}
		
			System.out.println("myThread has run over");
	}

}


class ExtendingExample
{
	public static void main(string args[])
	{
		Count cnt = new Count();
		
		try
		{
			while(cnt.isAlive())
			{
				System.out.println("Main Thread");
				Thread.sleep(1000);
			}
		}
		
		catch(InterruptedException e)
		{
			System.out.println("Main thread is interrupted");
		}
	}
}