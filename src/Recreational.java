final class Recreational extends Book{
	private String genre;

	


	public Recreational(String name, String isbn, int numberOfPages, String genre) {
		super(name, isbn, numberOfPages);
		this.genre = genre;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	
	public String toString() {
		return "Recreational\n" +super.toString()+"\nGenre: "+genre;
	}


	
	public int getType(){
		
		return 3;
		
	}
	
	
	
	
}
