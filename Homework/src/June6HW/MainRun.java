package June6HW;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MainRun {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student s1=new student("Winnie",24,2000);
		student s2=new student("John",30,2300);
		student s3=new student("vincent",23,700);
		student s4=new student("leo",31,500);
		student s5=new student("ivan",34,1400);
		
		HashMap<Integer,student> h=new HashMap<Integer,student>();
		h.put(1,s1);
		h.put(3,s2);
		h.put(2,s3);
		h.put(4,s4);
		h.put(5,s5);
		
		ArrayList<Map.Entry<Integer, student>> a=new ArrayList<>(h.entrySet());
//		a.addAll(h.entrySet());
		
		for(Map.Entry<Integer, student> item:h.entrySet()) {
			System.out.println(item.getValue().getName()+" , "+item.getValue().getDept());
		}
		
		
		Collections.sort(a, new CompareByDept());
		System.out.println("------------------");
		for(Map.Entry<Integer, student> item:a) {
			System.out.println(item.getKey() + item.getValue().getName()+" , "+item.getValue().getDept());
		}
	}
}
