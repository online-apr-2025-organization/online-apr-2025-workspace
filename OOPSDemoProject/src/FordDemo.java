
public class FordDemo {

	public static void main(String[] args) {
		FordFigo figo1 = new FordFigo("Hatch Back", "Diesel", "Ford Figo");
		figo1.color = "White";
		
		System.out.println(figo1.startCar());
		System.out.println(figo1.accelerate());
		System.out.println(figo1.applyBrakes());
		System.out.println(figo1.stopCar());
		
		System.out.println("--------------------------------");
		
		FordFigoTitanium tita1 = new FordFigoTitanium("Hatch Back", "Petrol", "Ford Titanium", 2);
		tita1.color = "Silver";
		
		System.out.println(tita1.startCar());
		System.out.println(tita1.accelerate());
		System.out.println(tita1.applyBrakes());
		System.out.println(tita1.ejectAirbags());
		System.out.println(tita1.stopCar());
		System.out.println("--------------------------------");
	}

}
