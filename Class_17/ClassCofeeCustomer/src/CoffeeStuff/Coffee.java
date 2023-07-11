package CoffeeStuff;

public class Coffee {
	
	private String manufacturer;
	private String name;
	private String strength;
	
	public Coffee () {
		this.manufacturer = "Timothys";
		this.name = "Breakfast Blend";
		this.strength = "light roast";
	}
	public Coffee ( String manufacturer, String name ) {
		this.manufacturer = manufacturer;
		this.name = name;
		this.strength = generateStrength();
	}
	public Coffee ( String manufacturer, String name, String strength ) {
		this.manufacturer = manufacturer;
		this.name = name;
		this.strength = strength;
	}
	
	private String generateStrength () {
		
		final String [] strengths = {
			"light roast", "medium roast",
			"medium-dark roast", "dark roast",
			"expresso roast"
		};
		
		int randomIndex = (int)(Math.random() * ( 4 + 1 ));
		
		return strengths [ randomIndex ];
	}
	
	public String getManufacturer() {
		return this.manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	
	public String getName() {
		return this.name;
	}
	public void setName ( String name ) {
		this.name = name;
	}
	
	public String getStrength() {
		return this.strength;
	}
	public void setStrength(String strength) {
		this.strength = strength;
	}
}
