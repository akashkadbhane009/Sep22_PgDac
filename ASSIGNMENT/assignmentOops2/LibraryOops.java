/*1. Create an abstract class “Publication” with data members ‘noOfPages’, ‘price’, ‘publisherName’ etc. with
their accessor/modifier functions. Now create two sub-classes “Book” and “Journal”. Create a class
Library that contains a list of Publications. Write a main() function and create three Books and two
Journals, add them to library and print the details of all publications.
@006_Akash_Kadbhane_JH
*/

abstract class Publication {
	int noOfPages,price;
	String publisherName;
	
	public Publication(int noOfPages, int price, String publisherName) {
		this.noOfPages = noOfPages;
		this.price = price;
		this.publisherName = publisherName;
		setNoOfPages(noOfPages);
		setPrice(price);
		setPublisherName(publisherName);
	}
	public int getNoOfPages() {
		return noOfPages;
	}
	public void setNoOfPages(int noOfPages) {
		this.noOfPages = noOfPages;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getPublisherName() {
		return publisherName;
	}
	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}
	
	
}
class Book extends Publication {
	String bookName;

	public Book(int noOfPages, int price, String publisherName, String bookName) {
		super(noOfPages, price, publisherName);
		this.bookName = bookName;
		setBookName(bookName);
		
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	void printBook() {
		System.out.println("Book Name : "+getBookName());
		System.out.println("Price : "+getPrice());
		System.out.println("Publication : "+getPublisherName());
		System.out.println("No. of Pages : "+getNoOfPages());
		System.out.println("================================================");
	}
	
	
	
}
class Journal extends Publication {
	String journalName;

	public Journal(int noOfPages, int price, String publisherName, String journalName) {
		super(noOfPages, price, publisherName);
		this.journalName = journalName;
		setJournalName(journalName);
	}

	public String getJournalName() {
		return journalName;
	}

	public void setJournalName(String journalName) {
		this.journalName = journalName;
	}
	void printJournal() {
		System.out.println("Book Name : "+getJournalName());
		System.out.println("Price : "+getPrice());
		System.out.println("Publication : "+getPublisherName());
		System.out.println("No. of Pages : "+getNoOfPages());
		System.out.println("================================================");
	}
	
}
public class LibraryOops {

	public static void main(String[] args) {
		Book b1 = new Book(123,99,"mcGrawGill","BookOfTheWeek");
		b1.printBook();
		Book b2 = new Book(321,88,"nirali","tech");
		b2.printBook();
		Book b3 = new Book(76,555,"BBK","BOOKAct");
		b3.printBook();
		
		Journal j1 = new Journal(232,666,"CCMA","J1");
		j1.printJournal();
		Journal j2 = new Journal(90,888,"MMAS","J2");
		j2.printJournal();

	}

}
/*
Book Name : BookOfTheWeek
Price : 99
Publication : mcGrawGill
No. of Pages : 123
================================================
Book Name : tech
Price : 88
Publication : nirali
No. of Pages : 321
================================================
Book Name : BOOKAct
Price : 555
Publication : BBK
No. of Pages : 76
================================================
Book Name : J1
Price : 666
Publication : CCMA
No. of Pages : 232
================================================
Book Name : J2
Price : 888
Publication : MMAS
No. of Pages : 90
================================================*/
