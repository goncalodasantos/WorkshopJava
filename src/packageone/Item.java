package packageone;

abstract class Item {


	
	private static int idToIncrement=0;//um incrementador est�tico, ou seja, � visivel e igual em todos os items.
	
	 private String name;//nome
	 private int id;//identificar do objeto (� semelhan�a de todas as librarias, temos um identificador para cada item)
	
	 
	
	public Item(String name) {//construtor. vai atribuir como identificador o idToIncrement, e depois vai adicionar-lhe 1 (para a pr�xima instancia ter um valor diferente)
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


	public String toString() {//fun��o para imprimir os dados deste objeto
		return "ID: "+id+"\nNome: "+name;
	}
	
	

	
	public abstract int getType();//fun��o abstrata para retornar o tipo. Como esta classe nunca vai ter instancias, pode ser declarada como abstrata e podemos n�o implementar aqui a fun��o
	
	
}
