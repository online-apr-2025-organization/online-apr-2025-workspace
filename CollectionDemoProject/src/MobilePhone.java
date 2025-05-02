import java.util.Objects;

public class MobilePhone{ //implements Comparable {
	
	private String model;
	private int year;
	
	public MobilePhone(String model, int year) {
		super();
		this.model = model;
		this.year = year;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(model, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		MobilePhone other = (MobilePhone) obj;
		return Objects.equals(model, other.model) && year == other.year;
	}

	@Override
	public String toString() {
		return "[model=" + model + ", year=" + year + "]";
	}

//	@Override
//	public int compareTo(Object o) {
//		MobilePhone otherPhone = (MobilePhone) o;
//		return this.model.compareTo(otherPhone.model);
//	}

}
