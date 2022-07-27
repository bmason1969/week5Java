package week5java;

public class Student {
	static int numberOfStudents;	
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private int gradeLevel;
	
	public Student() {}
	
	/*
	 * Constructors
	 */
	
	public Student (String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public Student(String firstName, String lastName, String phoneNumber, int gradeLevel) { // you can also overload a Constructor here, 
		//We don't put a return here only name of class. in ()
		//we put our parameters	. This way we can pass the values all in one line. we can pass value and store in the first line.
		//this inside a class, keyword. this.firstName. this way we assign our parameter value to our instance value
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.gradeLevel = gradeLevel;
		}
	
		/*
		 * Public methods
		 */
	
	public void introduce() {
		System.out.println("Hello, my name is " + firstName + " " + lastName);
		System.out.println("I am in grade" + " " + gradeLevel);
		System.out.println("My phobe number is " + phoneNumber);
	}
	
	/*
	 * Private methods
	 */
	private boolean checkLength(String str, int length) {
		return str.length() > length;
	}
	/*
	 * Getters and Setters
	 */
	
	public void setFirstName(String firstName) {
		if(checkLength(firstName, 1)) {
		this.firstName = firstName;
	}
}
	public String getFirstName() {
		return firstName;
	}
	
	public void setLastName(String lastName) {
		if(checkLength(lastName, 1)) {
		this.lastName = lastName;
	}
}	
	public String getLastName() {
		return lastName;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		if(checkLength(phoneNumber, 9)) {
		this.phoneNumber = phoneNumber;
	}
}	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setGradeLevel(int gradeLevel) {
		if(gradeLevel > 0 && gradeLevel < 13) {
		this.gradeLevel = gradeLevel;
	}
}	
	public int getGradeLevel() {
		return gradeLevel;
	}
}
