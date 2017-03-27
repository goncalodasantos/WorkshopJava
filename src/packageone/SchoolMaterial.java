package packageone;
final class SchoolMaterial extends Book{

	private String subject;
	private int year;
	
	
	public SchoolMaterial(String name, String isbn, int numberOfPages, String subject, int year) {//construtor do livro. De notar que vai chamar o construtor da sua superclasse.
		super(name, isbn, numberOfPages);
		this.subject = subject;
		this.year = year;
	}


	public String toString() {//fun��o para imprimir os dados deste objeto. Vai chamar o toString da sua superclasse, para imprimir tamb�m os dados dela
		return "SchoolMaterial\n"+super.toString()+"\nSubject: "+subject+"\nYear: "+year;
	}



	
	public int getType(){	//fun��o caso a instancia seja o um material escolar, returnar� 2
		
		return 2;
		
	}
	
	
	

	
	
}
