package packageone;
final class SchoolMaterial extends Book{

	private String subject;
	private int year;
	
	
	public SchoolMaterial(String name, String isbn, int numberOfPages, String subject, int year) {//construtor do livro. De notar que vai chamar o construtor da sua superclasse.
		super(name, isbn, numberOfPages);
		this.subject = subject;
		this.year = year;
	}


	public String toString() {//função para imprimir os dados deste objeto. Vai chamar o toString da sua superclasse, para imprimir também os dados dela
		return "SchoolMaterial\n"+super.toString()+"\nSubject: "+subject+"\nYear: "+year;
	}



	
	public int getType(){	//função caso a instancia seja o um material escolar, returnará 2
		
		return 2;
		
	}
	
	
	

	
	
}
