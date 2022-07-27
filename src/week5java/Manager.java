package week5java;

public class Manager extends Employee {
	
	public Manager(String firstName, String lastName, double pay, double bonusPercentage) {
		super(firstName, lastName, pay);
		this.bonusPercentage = bonusPercentage;
	}

	private double bonusPercentage ;

	@Override
	public double calculatePay() {
		// TODO Auto-generated method stub
		return this.getPay() * 80 * bonusPercentage;
	}
	
	

}
