
abstract class Book extends Item{
	private String isbn;
	private int numberOfPages;
	
	
	
	
	public Book(String name, String isbn, int numberOfPages) {
		super(name);
		this.isbn = isbn;
		this.numberOfPages = numberOfPages;
	}
	
	
	public String getIsbn() {
		return isbn;
	}
	public void setIban(String isbn) {
		this.isbn = isbn;
	}
	public int getNumberOfPages() {
		return numberOfPages;
	}
	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}


	@Override
	public String toString() {
		return super.toString()+"\nISBN: " + isbn + "\nNumberOfPages: " + numberOfPages;
	}
	
	

	
	public abstract int getType();	
	
	
}
