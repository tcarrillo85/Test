/*
 * Tomas Carrillo 
 * 11Mar22
 * Quiz #4
 * 
 * Product Class with attributes
 */
public abstract class TheProduct {
	
	String name;
	double price;
	int quantity;
	
	/*Some products are apparel so they will have name, 
	price, category, quantity, size, color 
	• Some products are books and they’ll have name, 
	price, category, quantity, author 
	• Some products are soap and they’ll have name, price, 
	category and quantity
*/
	//Constructors build for data
	public TheProduct(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		
		
	}
	//Getters and Setters

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	
	}
	
	public boolean buy() {
		if(this.quantity>0) {
			this.quantity--;
			return true;
			
		}
		else {
			return false;
		}
	}
}

