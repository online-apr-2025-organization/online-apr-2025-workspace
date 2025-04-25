
public class RoomDemo {

	public static void main(String[] args) {

		int mark;
		mark = 50;
		// int mark = 50;
		
		Room office; // here office can be called as object variable or reference variable
		office = new Room(200, 150, 100);
		
//		office.length = 200;
//		office.width = 150;
//		office.height = 100;
		
		int floorArea = office.calculateFloorArea();
		System.out.println("Floor ares of office : " + floorArea);
		
		int paintingCost = office.calculatePaintingCost(2);
		System.out.println("Cost of painting the office is " + paintingCost);
		
		//office = 0;
		//office = null;
		
		Room shop = new Room(300,200,150);
//		shop.length = 300;
//		shop.width = 200;
//		shop.height = 150;
		//shop.color = "Light Blue";
		shop.setColor("Light Blue");
		//shop.name = "Xerox shop";
		shop.setName("Xerox shop");
		//shop.setLength(1000);
		
		int floorArea1 = shop.calculateFloorArea();
		System.out.println("Floor ares of shop : " + floorArea1);
		
		int paintingCost1 = shop.calculatePaintingCost(3);
		System.out.println("Cost of painting the shop is " + paintingCost1);
		
		Room livingRoom = new Room(100, 60, 30, "Off-White", "Living Room");
		
	}

}
