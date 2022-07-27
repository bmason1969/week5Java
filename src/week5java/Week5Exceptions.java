package week5java;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Week5Exceptions {

	public static void main(String[] args) {
	// There are 2 types of exceptions: checked and unchecked	
		/* 
		 *checked exceptions: we want explicitly check for, in our code. we have no control over. 
		 *outside our data base.
		 *to handle checked exceptions we use Try Catch Block: these handles checked exceptions
		 *
		 * unchecked exceptions: we can avoid by writing clean code and following best practices. 
		 * programmer mistake. we have control over
		 */
		int[] numbers = new int[3];

		System.out.println("Hi");
		
		if(numbers.length > 3) {
			System.out.println(numbers[3]);
		}
		
		System.out.println("Bye");
		try {
			System.out.println(numbers[3]);
			System.out.println("In the try");
		}catch(Exception e) {
			System.out.println(e.getMessage());
			
			try {
			FileReader fileReader = new FileReader("something.text");
			}catch(FileNotFoundException e1) {
				System.out.println(e.toString());
			}finally{
				System.out.println("Finally");	
			}
			System.out.println("after the try catch");
			
			try {
				openFile("AnotherFile.jpg");
			}catch (FileNotFoundException e1) {
				e.printStackTrace();
		}
	}	
		
		public static FileReader openFile(String fileName) throws fileNotFoundException{
			return new FileReader(fileName);
			
		}
	}

}
