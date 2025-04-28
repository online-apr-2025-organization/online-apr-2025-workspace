
public class EmployeeArrayDemo {

	public static void main(String[] args) {
		// here we are creating one employee object
		Employee emp = new Employee(101, "ABC");
		
		// here we are create an array of  employee references
		// we are not creating employee objects here
		Employee[] allEmployees = new Employee[4];
		
		// now each Employee reference variable points to an Employee object
		allEmployees[0] = new Employee(102, "QWE");
		allEmployees[1] = new Employee(103, "ASD");
		allEmployees[2] = new Employee(104, "LMN");
		allEmployees[3] = new Employee(105, "FGH");
		
		System.out.println(allEmployees[1].getEmpId());
		System.out.println(allEmployees[1].getEmpName());
	}

}
