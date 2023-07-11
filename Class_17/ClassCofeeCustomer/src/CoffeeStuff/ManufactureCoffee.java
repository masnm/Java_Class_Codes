package CoffeeStuff;

public class ManufactureCoffee {

	public static void main(String[] args) {
		
		Coffee coffeeOne, coffeeTwo, coffeeThree;
		
		coffeeOne = new Coffee();
		System.out.println ( "CoffeeOne manufacturer : " + coffeeOne.getManufacturer() );
		System.out.println ( "CoffeeOne name : " + coffeeOne.getName() );
		System.out.println ( "CoffeeOne strength : " + coffeeOne.getStrength() );
		System.out.println ();
		
		coffeeTwo = new Coffee ( "Van Houte", "Holiday Blend" );
		
		coffeeThree = new Coffee ( "Green Mountain", "Peru", "dark roast" );
		
		coffeeThree.setManufacturer( "Starbucks" );
		coffeeThree.setName( "Blonde" );
		coffeeThree.setStrength( "medium roast" );
		
		System.out.println ( "New manufacturer : " + coffeeThree.getManufacturer() );
		System.out.println ( "New name : " + coffeeThree.getName() );
		System.out.println ( "New strength : " + coffeeThree.getStrength() );

	}

}
