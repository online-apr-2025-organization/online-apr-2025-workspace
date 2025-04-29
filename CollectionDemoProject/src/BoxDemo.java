
public class BoxDemo {

	public static void main(String[] args) {
		Box box1 = new Box(100, 50, 20);
		System.out.println(box1.getLength());
		System.out.println(box1.getBreadth());
		System.out.println(box1.getHeight());
		
		//Box box2 = new Box(25.5, 10.5, 5.5);
		System.out.println("--------------");
		BoxGenerics<Integer> box2 = new BoxGenerics<Integer>(20,10,5);
		System.out.println(box2.getLength());
		System.out.println(box2.getBreadth());
		System.out.println(box2.getHeight());
		
		System.out.println("--------------");
		BoxGenerics<Double> box3 = new BoxGenerics<>(40.2, 20.1, 10.5);
		System.out.println(box3.getLength());
		System.out.println(box3.getBreadth());
		System.out.println(box3.getHeight());
		
		BoxGenerics box4 = new BoxGenerics(20, 10, 1);
	}

}
