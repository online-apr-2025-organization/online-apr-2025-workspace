import java.util.Objects;

public class BoxGenerics<T> {
	private T length;
	private T breadth;
	private T height;
	
	public BoxGenerics(T length, T breadth, T height) {
		super();
		this.length = length;
		this.breadth = breadth;
		this.height = height;
	}

	public T getLength() {
		return length;
	}

	public void setLength(T length) {
		this.length = length;
	}

	public T getBreadth() {
		return breadth;
	}

	public void setBreadth(T breadth) {
		this.breadth = breadth;
	}

	public T getHeight() {
		return height;
	}

	public void setHeight(T height) {
		this.height = height;
	}

	@Override
	public int hashCode() {
		return Objects.hash(breadth, height, length);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BoxGenerics other = (BoxGenerics) obj;
		return Objects.equals(breadth, other.breadth) && Objects.equals(height, other.height)
				&& Objects.equals(length, other.length);
	}
}
