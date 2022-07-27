package week5java;

import java.util.Date;

public class ConsoleLogger implements Logger{

	public static void main(String[] args) {
		

	}

	@Override
	public void info(String info) {
		Date date = new Date();
		System.out.println(date.toString()+ ":" + info);
		
	}

	@Override
	public void warning(String warning) {
		Date date = new Date();
		System.out.println("Warning - " + date.toString()+ ":" + warning) ;
		
	}

	@Override
	public void error(String error) {
		Date date = new Date();
		System.out.println("Error - " + date.toString()+ ":" + error);
		
	}

	@Override
	public void fatal(String fatal) {
		Date date = new Date();
		System.out.println("FATAL!!!! - " + date.toString()+ ":" + fatal.toUpperCase());
		
	}

}
