public class Room {
	int length;
	int width;
	int height;
	
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
