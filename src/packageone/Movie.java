package packageone;

final class Movie extends Item{
	private double duration;
	private String producer;
	
	
	


	public Movie(String name, double duration, String producer) {//construtor do livro. De notar que vai chamar o construtor da sua superclasse.
		super(name);
		this.duration = duration;
		this.producer = producer;
	}



	public double getDuration() {
		return duration;
	}



	public void setDuration(double duration) {
		this.duration = duration;
	}



	public String getProducer() {
		return producer;
	}



	public void setProducer(String producer) {
		this.producer = producer;
	}



	public String toString() {//função para imprimir os dados deste objeto. Vai chamar o toString da sua superclasse, para imprimir também os dados dela
		return "Movie\n" +super.toString()+"\nDuration: "+ duration + "\nProducer: " + producer;
	}
	
	
	public int getType(){ //função caso a instancia seja o um material escolar, returnará 1
		
		return 1;
		
	}

	
	
}
