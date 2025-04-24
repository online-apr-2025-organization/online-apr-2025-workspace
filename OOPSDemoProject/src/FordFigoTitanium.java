public class FordFigoTitanium extends FordFigo{
	int noOfAirbags;
	
	
	
	public FordFigoTitanium(String carType, String gasType, String carModel, int noOfAirbags) {
//		this.carType = carType;
//		this.gasType = gasType;
//		this.carModel = carModel;
		super(carType, gasType, carModel);
		this.noOfAirbags = noOfAirbags;
	}

	String ejectAirbags() {
		return carModel + " has ejected airbags...";
	}
	
	//@Override
	String applyBrakes() {
		return carModel + " has applied ABS brakes...";
	}
}
