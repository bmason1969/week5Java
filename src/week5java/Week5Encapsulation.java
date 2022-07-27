package week5java;

public class Week5Encapsulation {
	public static void main(String[] args) {
		Student student = new Student();
		student.setFirstName("Sally");
		student.setPhoneNumber("1234567890");
		student.setGradeLevel(8);
		student.introduce();
		
		Rectangle rec = new Rectangle(10.0, 15.0);
		rec.setLength(10.0);
		System.out.println(rec.getArea());
		
		/*
		 * We need to encapsulate the objects data  and only expose what needs to be used and to do that we use Access Modifiers.
		 * Access Modifiers:
		 * There are 4 access Modifiers
		 * public- accessible everywhere
		 * private- only accessible within the class itself
		 * protected- accessible within the class, other classes in the same package and all subclasses.
		 * (a subclass is a class inherits from another class
		 * No Modifier- same as protected except it's not accessible in a subclass in different packages
		 */
	}

}
