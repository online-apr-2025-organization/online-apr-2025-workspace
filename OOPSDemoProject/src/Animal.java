
public class Animal {
	
	String name;
	
	public Animal(String name) {
		super();
		this.name = name;
	}

	String lives() {
		return name + " is a living thing...";
	}
	
	String mobility() {
		return name + " is mobile...";
	}
}
