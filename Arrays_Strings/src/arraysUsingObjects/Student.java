package arraysUsingObjects;

public class Student {
	
	public int rollNumber;
	public String name;
	Student(int rollNumber, String name){
		this.rollNumber = rollNumber;
		this.name = name;
	}
	
	public void display(){
		System.out.println("Student Names are "+rollNumber+": "+name);
	}

}
