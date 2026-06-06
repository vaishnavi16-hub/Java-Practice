
public class Account {
	
//Declaring variables...
	String accountHolderName;
	long accountNumber;
	double balance;
	
	
	public static void main(String[]args) {
		
//		Object creating....
		
		Account a1 = new Account();
		
//		Assigtning the value of variables....
		a1.accountHolderName= "vaishnavi";
		a1.accountNumber= 322345;
		a1.balance = 508009;
		
		
		System.out.println(a1.accountHolderName);
		System.out.println(a1.accountNumber);
		System.out.println(a1.balance);
	}
}
