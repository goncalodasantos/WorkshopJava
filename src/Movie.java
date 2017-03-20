
class Movie extends Item{
	private double duration;
	private String producer;
	
	
	


	public Movie(String name, double duration, String producer) {
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



	@Override
	public String toString() {
		return "Movie\n" +super.toString()+"\nDuration: "+ duration + "\nProducer: " + producer;
	}
	
	
	public int getType(){
		
		return 1;
		
	}

	
	
}
