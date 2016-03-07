package multiThreading;

public class Count implements Runnable{
	
	Thread myThread;
	
	Count(){
		myThread = new Thread(this,"my runnable thread");
		myThread.start();
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
