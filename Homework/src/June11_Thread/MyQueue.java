package June11_Thread;

import java.util.ArrayDeque;
import java.util.Queue;

public class MyQueue {
	
	Queue<car> que=new ArrayDeque<>();

	synchronized void produce(String name) {
		
		while(que.isEmpty()) {
			try {
				System.out.println("Consuming car no. "+name+ " Please wait");
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("produced car no. "+name+ " Notify");
		//que.remove();
		notify();
	}
	
	
	synchronized void consume(String name) {
		
		while(que.isEmpty()) {
			try {
				System.out.println("producing car no. "+name+ " Please wait");
				que.add(new car());
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("consumed car no. "+name+ " Notify");
		que.remove();
		notify();
		
	}
}
