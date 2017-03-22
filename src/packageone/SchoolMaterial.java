package packageone;
final class SchoolMaterial extends Book{

	private String subject;
	private int year;
	
	
	public SchoolMaterial(String name, String isbn, int numberOfPages, String subject, int year) {
		super(name, isbn, numberOfPages);
		this.subject = subject;
		this.year = year;
	}


	public String toString() {
		return "SchoolMaterial\n"+super.toString()+"\nSubject: "+subject+"\nYear: "+year;
	}



	
	public int getType(){
		
		return 2;
		
	}
	
	
	

	
	
}
