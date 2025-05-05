
public class InvalidOptionException extends Exception{
	private int option;

	public InvalidOptionException(int option) {
		super();
		this.option = option;
	}

	@Override
	public String getMessage() {
		return "The option " + option + " is invalid!";
	}
	
	
}
