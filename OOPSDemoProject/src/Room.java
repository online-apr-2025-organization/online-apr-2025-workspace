public class Room {
	private int length;
	private int width;
	static private int height;
	private String color;
	private String name;
	
	static {
		height = 100;
	}
	
	// remove height initialization through constructors
	Room(int length, int width, int height){
		this.length = length;
		this.width = width;
		this.height = height;
	}
	
	Room(int length, int width, int height, String name){
		this(length, width, height); // constructor chaining
		this.name = name;
	}
	
	Room(int length, int width, int height, String color, String name){
//		this.length = length;
//		this.width = width;
//		this.height = height;
		this(length, width, height, name); // constructor chaining
		this.color = color;
	}
	
	// getter method for length
	// accessors
	// gives read access to the variable length
	public int getLength() {
		return length;
	}
	
	// setter method for length
	// mutators
	// gives write access to the variable length
//	public void setLength(int length) {
//		this.length = length;
//	}
	
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	int calculateWallArea() {
		int wallArea = 2 * height * (length + width);
		return wallArea;
	}
	
	int calculatePaintingCost(int paintingRate) {
		int roomWallArea = calculateWallArea();
		int paintingCost = paintingRate * roomWallArea;
		return paintingCost;
	}
	
	int calculateFloorArea() {
		return length * width;
	}	
}
