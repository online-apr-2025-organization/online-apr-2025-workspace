
public class ICICIBank extends Bank{

	ICICIBank(double rateOfInterest){
		super(rateOfInterest);
	}
	
	@Override
	double calculateInterest() {
		double interest = getPrinciple() * getNumberOfYears() * getRateOfInterest() / 100;
		return interest;
	}

}
