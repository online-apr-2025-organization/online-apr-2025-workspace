
public class Demo {

	public static void main(String[] args) {
		Student s1 = new Student(2001, "Priya");
		Student s2 = new Student(2002, "Raj");
		Student s3 = new Student(2001, "Priya");
		Student s4 = s2;
		
		// reference equality
		System.out.println("s1 == s2 : " + (s1 == s2));
		System.out.println("s2 == s3 : " + (s2 == s3));
		System.out.println("s3 == s4 : " + (s3 == s4));
		System.out.println("s1 == s3 : " + (s1 == s3));
		System.out.println("s2 == s4 : " + (s2 == s4));
		
		// using equals method
		// before overriding equals method in Student class the output is
//		s1.equals(s2) : false
//		s2.equals(s3) : false
//		s3.equals(s4) : false
//		s1.equals(s3) : false
//		s2.equals(s4) : true
		// after overriding equals method in Student class the output is
//		s1.equals(s2) : false
//		s2.equals(s3) : false
//		s3.equals(s4) : false
//		s1.equals(s3) : true
//		s2.equals(s4) : true

		System.out.println("s1.equals(s2) : " + (s1.equals(s2)));
		System.out.println("s2.equals(s3) : " + (s2.equals(s3)));
		System.out.println("s3.equals(s4) : " + (s3.equals(s4)));
		System.out.println("s1.equals(s3) : " + (s1.equals(s3)));
		System.out.println("s2.equals(s4) : " + (s2.equals(s4)));
	}

}
