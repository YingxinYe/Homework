package June11_Thread;

public class Consumer extends Thread {
	MyQueue q;
	String name;
	
	
	public Consumer(MyQueue q,String name) {
		super();
		this.q = q;
		this.name=name;
	}



	public void run() {
		// TODO Auto-generated method stub
		q.consume(name);
		
	}
	
}
