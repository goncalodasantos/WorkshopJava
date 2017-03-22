package packageone;
import java.util.ArrayList;




public class WorkShop {

	public static void main(String[] args) {
		ArrayList<Item> items= new ArrayList<Item>();
		float totalDurationOfMovieLibrary=0;
		int totalNumberOfPages=0;
		
		
		
		Recreational book1= new Recreational("Student's Life", "1200", 100, "Drama");
		SchoolMaterial book2= new SchoolMaterial("How to Java 101", "1600", 200, "Science", 12);
		Movie movie1= new Movie("Monty Python", 100.0, "The boss");
		
		items.add(book1);
		items.add(book2);
		items.add(movie1);
		
		
		
		for(int j=0;j<items.size();j++){
			System.out.println("Type: "+ items.get(j).getType()+" "+items.get(j).toString()+"\n");
		}
		
		for(int j=0;j<items.size();j++){
			switch(items.get(j).getType()){
				case 1:
					
					totalDurationOfMovieLibrary+=((Movie)items.get(j)).getDuration();
					break;
				case 2:

				case 3:
					totalNumberOfPages+=((Book)items.get(j)).getNumberOfPages();
					
					
					break;
			}
		}
		
		System.out.println("Total Number Of Pages in Library: "+totalNumberOfPages);
		System.out.println("Total Duration of Movies in Library: "+totalDurationOfMovieLibrary);
		
		
	}

}