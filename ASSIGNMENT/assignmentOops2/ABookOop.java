/*7. Create a class called Author is designed as follows:
It contains: • three private instance variables: name (String), email (String), and gender (char of either ‘m’ or ‘f’). •
One constructor to initialize the name, email and gender with the given values.
And, a class called Book is designed as follows: It contains: • Four private instance variables: name (String), author
(of the class Author you have just created), price (double), and qtyInStock (int). Assuming that each book is written
by one author. • One constructor which constructs an instance with the values given. • Getters and setters:
getName(), getAuthor(), getPrice(), setPrice(), getQtyInStock(), setQtyInStock(). Again there is no setter for name
and author. Write the class Book (which uses the Author class written earlier). Try:
1.Printing the book name, price and qtyInStock from a Book instance. (Hint: aBook.getName())
2. After obtaining the “Author” object, print the Author (name, email & gender) of the book
@006_Akash kadbahne_JH
*/
class Author {
	private String name,email;
	private char gender;
	public Author() {
		this("J.K.Rawlings","JkR@email.com",'f');
	}

	public Author(String name, String email, char gender) {
		this.name = name;
		this.email = email;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public char getGender() {
		return gender;
	}


}
class ABook{
	private String bookName;
	private double price;
	private int qtyInStock;
	private Author author;

	public ABook() {
	}
	public ABook(String bookName) {//, double price, int qtyInStock, Author author
		this.bookName = bookName;
		//this.price = price;
		//this.qtyInStock = qtyInStock;
		author = new Author();//"J.K.Rawlings","JkR@email.com",'f'
	}
	public String getBookName() {
		return bookName;
	}
	public double getPrice() {
		return price;
	}
	public int getQtyInStock() {
		return qtyInStock;
	}
	public Author getAuthor() {
		return author;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	public void setQtyInStock(int qtyInStock) {
		this.qtyInStock = qtyInStock;
	}
	void printBook() {
		System.out.println("=========================================");
		System.out.println("Book Name : "+getBookName());
		System.out.println("Price :"+getPrice());
		System.out.println("Stock Quantity : "+getQtyInStock());
		System.out.println("Author : "+(author.getName()));
		System.out.println("Email : "+(author.getEmail()));
		System.out.println("Gender  : "+(author.getGender()));
		System.out.println("=========================================");
	}

}



public class ABookOop {

	public static void main(String[] args) {
		ABook aBook = new ABook("Harry Potter");
		aBook.setPrice(5005.89);
		aBook.setQtyInStock(11);
		aBook.printBook();


	}

}

/*
=========================================
Book Name : Harry Potter
Price :5005.89
Stock Quantity : 11
Author : J.K.Rawlings
Email : JkR@email.com
Gender  : f
=========================================*/
