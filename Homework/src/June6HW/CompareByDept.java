package June6HW;
import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;

public class CompareByDept implements Comparator<Map.Entry<Integer, student>> {


	@Override
	public int compare(Map.Entry<Integer, student> o1, Map.Entry<Integer, student> o2) {
		// TODO Auto-generated method stub
		if(o1.getValue().getDept()<o2.getValue().getDept()) {
			return 1;
		}else{ 
			return -1;
			}
//		return Integer.valueOf(o1.getValue().getDept()).compareTo(o2.getValue().getDept());
		
	}

}
