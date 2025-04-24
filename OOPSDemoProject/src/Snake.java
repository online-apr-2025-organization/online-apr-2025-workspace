
public class Snake extends Animal{
	public Snake(String name) {
		super(name);
	}

	@Override
	String mobility() {
		return name + " crawls...";
	}
	
	String attacks() {
		return name + " can attack...";
	}
}
