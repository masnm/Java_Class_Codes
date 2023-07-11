package CustomerStuff;

public class CustomerTester {

	public static void main(String[] args) {
		
		Customer customer;
		
		customer = new Customer ( "A new Name", "abc@gmail.com" );
		
		System.out.println ( "Cust Id " + customer.getCustID() );
		System.out.println ( "Cust name " + customer.getName() );
		System.out.println ( "Cust mail " + customer.getEmail() );
		System.out.println ();

		customer = new Customer ( "Another Name", "def@gmail.com" );
		System.out.println ( "Cust Id " + customer.getCustID() );
		System.out.println ( "Cust name " + customer.getName() );
		System.out.println ( "Cust mail " + customer.getEmail() );
		System.out.println ();
	}
}
