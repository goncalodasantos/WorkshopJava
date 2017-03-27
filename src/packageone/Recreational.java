package packageone;
final class Recreational extends Book{
	private String genre;

	


	public Recreational(String name, String isbn, int numberOfPages, String genre) {//construtor do livro. De notar que vai chamar o construtor da sua superclasse.
		super(name, isbn, numberOfPages);
		this.genre = genre;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	
	public String toString() {//fun��o para imprimir os dados deste objeto. Vai chamar o toString da sua superclasse, para imprimir tamb�m os dados dela
		return "Recreational\n" +super.toString()+"\nGenre: "+genre;
	}


	
	public int getType(){ //fun��o caso a instancia seja o um material escolar, returnar� 3
		
		return 3;
		
	}
	
	
	
	
}
