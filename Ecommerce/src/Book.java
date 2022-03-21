/*
 * Book Class
 * inherits from TheProduct class
 * private attributes defined here
 */
public class Book extends TheProduct{
	
	String author;
	String genre;
	String isbn;
	
	public Book(String name, double price, int quantity, String author) {
		super(name, price, quantity);
		// TODO Auto-generated constructor stub
	}

	public Book(String name, double price, int quantity, String author, String genre, String isbn) {
		super(name, price, quantity);
		// TODO Auto-generated constructor stub
	}
	void getDetails() {
		System.out.println("We sell books on Software Development");
	}
	
	
	
	
	}
	
