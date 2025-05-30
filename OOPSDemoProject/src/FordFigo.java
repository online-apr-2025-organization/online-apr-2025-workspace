
public class FordFigo {
	String carType;
	String color;
	String gasType;
	String carModel;

	public FordFigo(String carType, String gasType, String carModel) {
		super();
		this.carType = carType;
		this.gasType = gasType;
		this.carModel = carModel;
	}

	public FordFigo(String carType, String color, String gasType, String carModel) {
		this(carType, gasType, carModel);
		this.color = color;
	}

	String startCar() {
		return carModel + " has been started...";
	}
	
	String accelerate() {
		return carModel + " has been accelerated...";
	}
	
	String applyBrakes() {
		return carModel + " has applied mannual brakes...";
	}
	
	String stopCar() {
		return carModel + " has been stopped...";
	}
}
