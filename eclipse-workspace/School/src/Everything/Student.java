package Everything;

public class Student {
	private String myName;
	private int myYearOfBirth;
	
	public Student() {
		myName = "Susan Alleyne";
		myYearOfBirth = 1999;
	}
	
	public Student (String name, int yearOfBirth) {
		myName = name;
		myYearOfBirth = yearOfBirth;
	}
	
	public String getname() {
		return myName;
	}
	
	public void setName(String name) {
		myName = name;
	}
	
	public static void main(String[] args) {
		Student stuOne = new Student();
		System.out.println("Student: " + stuOne.myName + "\t" + stuOne.myYearOfBirth);
		
		Student stuTwo = new Student("Thomas", 1995);
		System.out.println("Student: " + stuTwo.myName + "\t" + stuTwo.myYearOfBirth);
		
		stuOne.setName("Tom");
		System.out.println("Student: " + stuOne.myName + "\t" + stuOne.myYearOfBirth);
	}
}
