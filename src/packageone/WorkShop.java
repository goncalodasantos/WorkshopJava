package packageone;
import java.util.ArrayList;
import java.util.Scanner;




public class WorkShop {

	public static void main(String[] args) {
		
		
		
		ArrayList<Item> items= new ArrayList<Item>();//Lista de livros, com o tipo Item
		
		float totalDurationOfMovieLibrary=0;//Acumulador para contar a quantidade de minutos disponível na libraria, em filmes
		
		int totalNumberOfPages=0;//Acumulador para contar a quantidade de páginas disponível na libraria, em livros
		
		
		
		Recreational book1= new Recreational("Student's Life", "1200", 100, "Drama");//Criar o primeiro livro
		SchoolMaterial book2= new SchoolMaterial("How to Java 101", "1600", 200, "Science", 12);//Criar o segundo livro
		Movie movie1= new Movie("Monty Python", 100.0, "The boss");//criar o primeiro filme
		
		
		//como todos eles são items, podem ser adicionado à lista de items
		items.add(book1);
		items.add(book2);
		items.add(movie1);
		
		
		//agora vamos correr todos os items da nossa lista, e imprimir as informações deles
		//também vai chamar o getType() da instância
		//todos os tipos de objetos
		for(int j=0;j<items.size();j++){
			System.out.println("Type: "+ items.get(j).getType()+" "+items.get(j).toString()+"\n");
		}
		
		
		//agora vamos correr todos os items e aumentar o numero de páginas ou de minutos
		for(int j=0;j<items.size();j++){
			
			//o cast para (Movie) ou (Filme) só pode ser usado quando HÁ CERTEZA QUE A CLASSE ESTÁ A SER CONVERTIDA PARA O TIPO CERTO
			//caso contrário há uma excepção
			//assim, primeiro acha-se o tipo, e depois converte-se
			//por outro lado, isto permite chamar funções declaradas no filme, que não fazendo sentido ser declaradas em item, podem ser utilizadas na mesma
			//é o caso do getDuration()
			switch(items.get(j).getType()){
				//caso seja um filme
				case 1:
					totalDurationOfMovieLibrary+=((Movie)items.get(j)).getDuration();
					break;
					
				//caso seja um livro recreacional
				case 2:
					
				//caso seja um livro escolar
				case 3:
					totalNumberOfPages+=((Book)items.get(j)).getNumberOfPages();
					
					break;
			}
		}
		
		System.out.println("Total Number Of Pages in Library: "+totalNumberOfPages);
		System.out.println("Total Duration of Movies in Library: "+totalDurationOfMovieLibrary);
		
		
		
		//sugestões
		//coisas que não devem ser feitas
		//System.out.println(material1 instanceof MaterialEscolar);  forma errada
		//System.out.println(material1.getClass());  forma errada
		//System.out.println(material1.getType());  forma correta, mas é preciso implementar o polimorfismo como está implementado neste exemplo		
	
		
		
		
		//Exemplo
		//imaginem que queremos ler um inteiro do utilizador
		//para evitar lixo no scanner, a melhor ideia é sempre ler toda a linha, e depois converter para inteiro
		//desta forma, se não for um inteiro, é levantada uma excepção, e podemos pedir outra vez, ou algo assim.
		//o uso de excepções é importante em projetos remotos e mais avançados
		Scanner sc= new Scanner(System.in);
		while(true){
			try{
				System.out.println("\n\nInsira um inteiro, pf");
				String line=sc.nextLine();
				int number= Integer.parseInt(line);
				System.out.println("Li o inteiro "+number);
				break;
			}
			catch (NumberFormatException e){
				System.out.println("Excepção ao dar parse da linha, tente outra vez");
			}
		}
		
	
		
		
		
	}

}