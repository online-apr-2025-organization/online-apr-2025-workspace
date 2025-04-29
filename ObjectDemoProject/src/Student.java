import java.util.Objects;

public class Student {
	private int studId;
	private String studName;
	private int studMark;
	
	public Student(int studId, String studName) {
		super();
		this.studId = studId;
		this.studName = studName;
	}

	public Student(int studId, String studName, int studMark) {
		super();
		this.studId = studId;
		this.studName = studName;
		this.studMark = studMark;
	}

	public int getStudId() {
		return studId;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public int getStudMark() {
		return studMark;
	}

	public void setStudMark(int studMark) {
		this.studMark = studMark;
	}

	@Override
	public int hashCode() {
		return Objects.hash(studId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return studId == other.studId;
	}
	
//	@Override
//	public boolean equals(Object obj) {
//		if (obj == null) return false;
//		Student other = (Student) obj;
//		if(this.studId == other.studId) {
//			return true;
//		}
//		return false;
//	}
//	
//	@Override
//	public int hashCode() {
//		return this.studId;
//	}
	
	
}
