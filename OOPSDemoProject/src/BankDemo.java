
public class BankDemo {

	public static void main(String[] args) {
		Bank bank1 = new ICICIBank(12);
		bank1.setPrinciple(100000);
		bank1.setNumberOfYears(5);
		System.out.println("Interest is : " + bank1.calculateInterest());
		System.out.println("Annual Tax is : " + bank1.calculateAnnualTax());

	}

}
