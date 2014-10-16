
public class MyList<E> {
	
	public MyList(){
		
	}
	
	int size(){
		return 0;
	}
	
	boolean contains (E x){
		return true;
	}
	
	E get (int idx){
		
	}
	
	//Agrega x al final
	void add (E x){}
	
	//Agrega x en la posición idx
	boolean add (int idx, E x){
		return true;
	}
	
	//agrega x entre cada par de elementos
	void intercalate (E x){}
	
	//dice si lst se puede intercalar con la lista
	boolean intercalate (MyList<E> lst){
		return true;
	}
	
	//Elimina la primera ocurrencia
	E remove(E x){
		return E;
	}
	
	//agrupa elementos iguales
	void join(){}
	
	//dice si lst es una sublista
	boolean sublist(MyList<E> lst){
		return true;
	}

}
