
public class Car {

	
	
//	Declare the variable...
	int carId;
	String carColor ;
	String caCompany;
	
	
//	main metho...
	public static void main(String[]args) {
		
//		create object...
		Car c = new Car();
		
//		Assign value to the variables....
		
		c.caCompany= "bmw";
		c.carId= 465437;
		c.carColor= "black";
		
		
		
		System.out.println(c.caCompany);
		System.out.println(c.carColor);
		System.out.println(c.carId);
		
	}
}
