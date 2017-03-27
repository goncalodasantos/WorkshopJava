package packageone;

abstract class Item {


	
	private static int idToIncrement=0;//um incrementador estático, ou seja, é visivel e igual em todos os items.
	
	 private String name;//nome
	 private int id;//identificar do objeto (à semelhança de todas as librarias, temos um identificador para cada item)
	
	 
	
	public Item(String name) {//construtor. vai atribuir como identificador o idToIncrement, e depois vai adicionar-lhe 1 (para a próxima instancia ter um valor diferente)
		this.name = name;
		this.id=idToIncrement;
		idToIncrement++;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getId() {
		return id;
	}


	public String toString() {//função para imprimir os dados deste objeto
		return "ID: "+id+"\nNome: "+name;
	}
	
	

	
	public abstract int getType();//função abstrata para retornar o tipo. Como esta classe nunca vai ter instancias, pode ser declarada como abstrata e podemos não implementar aqui a função
	
	
}
