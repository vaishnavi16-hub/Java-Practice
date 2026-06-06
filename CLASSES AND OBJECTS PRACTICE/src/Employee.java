
public class Employee {

//	Declaring variables...
	int EmployeeId;
	String Name;
	int mobileNo;
	
//	main method.....
	public static void main(String[]args) {
		
//		creating objects....
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		
//		Assign value eto the variables
		e1.EmployeeId = 65488;
		e1.mobileNo = 432764764;
		e1.Name = "vauishnavi";
//		
		
		
		e2.EmployeeId = 437674;
		e1.mobileNo = 432764764;
		e2.Name = "sakshi";
		
		System.out.println("First Employee Details");
		System.out.println(e1.EmployeeId);
		System.out.println(e1.mobileNo);
		System.out.println(e1.Name);
		
		System.out.println("------------------------");
		System.out.println("Second Employee Details");
		System.out.println(e2.EmployeeId);
		System.out.println(e2.mobileNo);
		System.out.println(e2.Name);
	}
}
