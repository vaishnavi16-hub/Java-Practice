
public class Laptop {
//	Declare the variables...
	 int laptopNo;
	 String laptopName;
	 String laptopVersion;
	
//	main method.....
	public static void main(String[]args) {
		
//	create objects.....
		Laptop l1 = new Laptop();
		Laptop l2 = new Laptop();
		
//		Assign value to the variables....
		l1.laptopName="lenovo";
		l1.laptopNo = 23;
		l1.laptopVersion = "10pro";
		
		
		l2.laptopName = "Dell";
		l2.laptopNo= 67;
		l2.laptopVersion = "11pro";
		
		System.out.println("First laptop details......");
		System.out.println(l1.laptopName);
		System.out.println(l1.laptopNo);
		System.out.println(l1.laptopVersion);
		System.out.println();
		
		System.out.println("Second laptop details......");
		System.out.println(l2.laptopName);
		System.out.println(l2.laptopNo);
		System.out.println(l2.laptopVersion);
		

	
		
	}
}
