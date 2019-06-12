package June6HW;



public class student {
	
	private String name;
	private int age;
	private int dept;
	
	public student(){
	}

	public student(String name, int age, int dept) {
		super();
		this.name = name;
		this.age = age;
		this.dept = dept;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public int getDept() {
		return dept;
	}



	public void setDept(int dept) {
		this.dept = dept;
	}




}
