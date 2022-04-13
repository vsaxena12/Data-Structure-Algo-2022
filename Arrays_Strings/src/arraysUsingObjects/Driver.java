package arraysUsingObjects;

public class Driver {
	public static void main(String args[]) {
		Student s[] = new Student[5];
		s[0] = new Student(1, "Var");
		s[1] = new Student(2, "Ash");
		s[2] = new Student(3, "Duck");
		s[3] = new Student(4, "Baigels");
		s[4] = new Student(5, "Test");
		
		for(int i=0; i<s.length; i++) {
			s[i].display();
		}
	}
}
