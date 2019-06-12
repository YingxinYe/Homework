package June11_Thread;

public class Producer extends Thread {
	MyQueue q;
	String name;
	
	
	public Producer(MyQueue q,String name) {
		super();
		this.q = q;
		this.name=name;
	}



	public void run() {
		// TODO Auto-generated method stub
		q.produce(name);
	
		
	}

}
