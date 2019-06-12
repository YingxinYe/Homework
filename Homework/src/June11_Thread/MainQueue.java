package June11_Thread;

public class MainQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyQueue q=new MyQueue();
		
		Consumer c=new Consumer(q,"car1");
		c.start();
		
		Producer p=new Producer(q,"car1");
		p.start();
		
		
		
		Consumer c2=new Consumer(q,"car2");
		c2.start();
		
		Producer p2=new Producer(q,"car2" );
		p2.start();
		
		
		
	}

}
