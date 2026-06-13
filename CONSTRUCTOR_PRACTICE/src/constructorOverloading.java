
public class constructorOverloading {
    
	public  constructorOverloading() {
		System.out.println("default constructor");
	}
	
	public constructorOverloading (String name) {
		System.out.println("Name = " + name);
	}
	
	
	public constructorOverloading(String name, int rollNo) {
		System.out.println("Name = "+ name);
		System.out.println("rollNo = "+ rollNo);
	}
}
