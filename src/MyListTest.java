//@author Andrés Felipe Leon Cruz Jaime Humberto Toba Veloza

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class MyListTest {
	
	MyList<String> myList1;
	MyList<String> myList2;
	
	@BeforeClass
	public static void setUpClass() throws Exception {
		
	}
	
	@Before
	public void setUp(){
		myList1 = new MyList<String>();
		myList2 = new MyList<String>();
		
		myList1.add("a");
		myList1.add("b");
		myList1.add("c");
		
	}
	
	//Test Constructor
	@Test
	public void testConstructor(){
		myList1 = new MyList<String>();
		assertEquals(0, myList1.size());
	}
	
	//Test Tamano
	@Test
	public void testSize() {
		assertEquals(3, myList1.size());
	}

	//Test Tamano 0 cuando no hay objetos
	@Test
	public void testSizeEmpty() {
		assertEquals(0, myList2.size());
	}
	
	//Test Add objeto agregado a ultima posicion
	@Test
	public void testAdd() {
		myList1.add("d");
		assertEquals("d", myList1.get(myList1.size()-1));
	}
	
	//Test Add tamano de lista actualizado
	@Test
	public void testAddSize() {
		int tamanoAntes = myList1.size();
		myList1.add("d");
		assertEquals(tamanoAntes+1,myList1.size());
	}
	
	public void testAddNull(){
		myList1.add(null);
		assert
	}
	//faltan test de add(x,E)
	
	//faltan test de contains
	
	//faltan test de get
	
	//faltan test de intercalate (E)
	
	//faltan test de intercalate(MyList <E>)
	
	//faltan test de join
	
	//faltan test de remove(E)
	
	//faltan test de sublist(MyList<E>)

	
}
