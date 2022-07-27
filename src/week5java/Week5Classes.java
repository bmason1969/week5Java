package week5java;

public class Week5Classes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder name = new StringBuilder();//the first StringBuilder is the class the new String Builder is the object, instance
		StringBuilder name2 = new StringBuilder();// this method is a constructor
		
		Student student1 = new Student();// this method is also a constructor
		student1.firstName = "Tom";
		student1.lastName = "Smith";
		student1.gradeLevel = 12;
		student1.phoneNumber = "900-500-400";
		
		student1.introduce();
		
		Student student2 = new Student("Sammy", "Jones");
		student2.introduce();
		
		Student student3 = new Student("Tom", "Little", "900-600-700", 11);
		student3.introduce();
		
		
		
	}

}
