/*
 * Aooarel class
 * inherits from TheProduct class
 * attributes defined 
 */
public class Apparel extends TheProduct {
	
	private char size;
	String color;
	//constructor created
	public Apparel(String name, double price, int quantity, char size, String color) {
		super(name, price, quantity);
		// TODO Auto-generated constructor stub
	}//method with print statement
	void getDetails() {
		System.out.println("We sell different kinds of business clothes for both men and women");
	}
	
	

}
