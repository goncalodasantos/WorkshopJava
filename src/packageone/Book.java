package packageone;

abstract class Book extends Item{
	private String isbn;
	private int numberOfPages;
	
	
	
	
	public Book(String name, String isbn, int numberOfPages) {//construtor do livro. De notar que vai chamar o construtor da sua superclasse.
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


	public String toString() {//fun��o para imprimir os dados deste objeto. Vai chamar o toString da sua superclasse, para imprimir tamb�m os dados dela
		return super.toString()+"\nISBN: " + isbn + "\nNumberOfPages: " + numberOfPages;
	}
	
	

	
	public abstract int getType();	//fun��o abstrata para retornar o tipo. Como esta classe nunca vai ter instancias, pode ser declarada como abstrata e podemos n�o implementar aqui a fun��o
	
	
}
