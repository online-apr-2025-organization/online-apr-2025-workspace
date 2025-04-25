
public abstract class Bank {
	private double rateOfInterest;
	private double principle;
	private int numberOfYears;

	public Bank(double rateOfInterest) {
		super();
		this.rateOfInterest = rateOfInterest;
	}
	
	
	public double getRateOfInterest() {
		return rateOfInterest;
	}


	public void setRateOfInterest(double rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}


	public double getPrinciple() {
		return principle;
	}


	public void setPrinciple(double principle) {
		this.principle = principle;
	}


	public int getNumberOfYears() {
		return numberOfYears;
	}


	public void setNumberOfYears(int numberOfYears) {
		this.numberOfYears = numberOfYears;
	}


	abstract double calculateInterest();
	
	double calculateAnnualTax() {
		return 30;
	}
}
