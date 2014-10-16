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
	
	@Test
	public void testConstructor(){
		myList1 = new MyList<String>();
		assertEquals(0, myList1.size());
	}
	
	@Test
	public void testSize() {
		assertEquals(3, myList1.size());
	}

	@Test
	public void testSizeEmpty() {
		assertEquals(0, myList2.size());
	}
	
	//faltan test de add(E)
	public void testAdd(){
		myList1.add("3");
		assertEquals("3",myList1.get(3));
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
