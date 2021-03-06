//@author Andrés Felipe Leon Cruz Jaime Humberto Toba Veloza

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

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
	public void setUp() {
		myList1 = new MyList<String>();
		myList2 = new MyList<String>();

		myList1.add("a");
		myList1.add("b");
		myList1.add("c");
	}

	// Test Constructor
	@Test
	public void testConstructor() {
		myList1 = new MyList<String>();
		assertEquals(0, myList1.size());
	}

	// Test Tamano
	@Test
	public void testSize() {
		assertEquals(3, myList1.size());
	}

	// Test Tamano 0 cuando no hay objetos
	@Test
	public void testSizeEmpty() {
		assertEquals(0, myList2.size());
	}

	// Test Add revisa el objeto agregado a la ultima posicion
	@Test
	public void testAdd() {
		myList1.add("d");
		assertEquals("d", myList1.get(myList1.size() - 1));
	}

	// Test Add revisa el agregar un null sin problemas
	@Test
	public void testAddNull() {
		myList1.add(null);
		assertEquals(null, myList1.get(myList1.size() - 1));
	}

	// Test Add revisa el tamano de la lista actualizado
	@Test
	public void testAddSize() {
		int tamanoAntes = myList1.size();
		myList1.add("d");
		assertEquals(tamanoAntes + 1, myList1.size());
	}

	// Test Add(x,E) revisa que el objeto es agregado en indice especifico
	@Test
	public void testAddIdx() {
		myList1.add(1, "d");
		assertEquals("d", myList1.get(1));
	}

	// Test Add revisa el tamano de lista actualizado
	@Test
	public void testAddIdxSize() {
		int tamanoAntes = myList1.size();
		myList1.add(1, "d");
		assertEquals(tamanoAntes + 1, myList1.size());
	}

	// Test Remove revisa el tamano adecuado luego de un remove
	@Test
	public void testRemoveSize() {
		int tamanoAntes = myList1.size();
		myList1.remove("b");
		assertEquals(tamanoAntes - 1, myList1.size());
	}

	// Test Remove se espera un null pointer exception cuando se
	// hace remove para un objeto que no existe

	@Test(expected = NullPointerException.class)
	public void testRemoveNo() {
		myList1.remove("d");
	}

	// Test de contains
	// Revisa si puede encontrar en la lista un valor conocido
	@Test
	public void testContains() {
		assertTrue(myList1.contains("a"));
	}

	// Revisa si devuelve falso para un valor que no se encuentra en la lista
	@Test
	public void testContainsFalse() {
		assertFalse(myList1.contains("k"));
	}

	// Asegura que un NullPointerException es enviado cuando se envia un objeto
	// nulo
	@Test(expected = NullPointerException.class)
	public void testContainsNull() {
		myList1.contains(null);
	}

	// Asegura que no interpreta a una cadena vacia como un objeto nulo
	@Test
	public void testContainsEmpty() {
		assertFalse(myList1.contains(""));
	}

	// Asegura que no puede encontrar ningun tipo de objeto que no se encuentre
	// dentro de la lista
	@Test
	public void testContainsObject() {
		assertFalse(myList1.contains(new Object().toString()));
	}

	// Test de get

	// Prueba que la función get este devolviendo el valor correcto para un
	// elemento ya conocido de la lista.

	@Test
	public void testGet() {
		assertEquals(myList1.get(0), "a");
	}

	// Prueba que el método get retorne una excepcion en caso que la lista este
	// vacia

	@Test(expected = IndexOutOfBoundsException.class)
	public void testGetEmpty() {
		myList2.get(0);
	}

	// Prueba que el método get no retorna el último elemento de la lista cuando
	// se solicita

	// un valor más alto que el tamaño de la misma sino en su lugar devuelve una
	// excepcion.

	@Test(expected = IndexOutOfBoundsException.class)
	public void testGetTooBig() {
		myList1.get(6);
	}

	// Test de intercalate (E)

	// El tamaño se debe duplicar
	public void testIntercalateObjSize() {
		myList1.intercalate("d");
		assertEquals(6, myList1.size());
	}

	// Verificar posiciones del objeto intercalado
	public void testIntercalateObjPos() {
		myList1.intercalate("d");
		assertTrue(myList1.get(1) == "d" && myList1.get(3) == "d"
				&& myList1.get(5) == "d");
	}

	// Test de intercalate (MyList<E>)

	// Asumimos que para que dos listas sean intercalables deben tener el mismo
	// tamaño

	@Test
	public void testIntercalate() {

		myList2.add("1");
		myList2.add("2");
		myList2.add("3");
		assertTrue(myList1.intercalate(myList2));
	}

	// Esperamos un false ya que las dos listas tienen tamaños diferentes

	@Test
	public void testIntercalableFalse() {
		assertFalse(myList1.intercalate(myList2));
	}

	// Prueba de intentar realizar un intercalamiento con la lista 2 la cual
	// debe ser imposible debido

	// a que es un objeto nulo.

	@Test(expected = NullPointerException.class)
	public void testIntercalableNull() {
		myList2 = null;
		myList1.intercalate(myList2);
	}

	// Como no hay elementos iguales el tamaño de la lista no debe cambiar
	@Test
	public void testJoinNothingToJoin() {
		myList1.join();
		assertEquals(3, myList1.size());

	}

	// Como no hay elementos en la lista el tamaño deberia mantenerse en 0
	@Test
	public void testJoinEmptyList() {
		myList1.join();
		assertEquals(0, myList2.size());
	}

	// Realiza el join de un solo elemento
	@Test
	public void testJoinOneElement() {
		myList1.add("a");
		myList1.join();

		assertEquals(3, myList1.size());
	}

	// Realiza la union de dos elementos diferentes a la vez
	@Test
	public void testJoinTwoElements() {
		myList1.add("a");
		myList1.add("b");
		myList1.join();

		assertEquals(3, myList1.size());
	}

	// Prueba la union de dos elementos en un mismo objeto a la vez
	@Test
	public void testJoinTwoSimilarElements() {
		myList1.add("a");
		myList1.add("a");
		myList1.join();

		assertEquals(3, myList1.size());
	}

	// Test de Sublist
	// Prueba que para que una lista este sea una sublista de otra TODOS los
	// elementos deben pertenercer a ella
	@Test
	public void testSublist() {
		myList2.add("a");

		assertTrue(myList1.sublist(myList2));
	}

	// La lista vacia es un subconjunto de una lista por lo cual debe arrojar
	// true
	@Test
	public void testSublistEmpty() {
		assertTrue(myList1.sublist(myList2));
	}

	// Una lista no puede ser subconjunto de una lista vacia
	@Test
	public void testSublistInverseEmpty() {
		assertFalse(myList2.sublist(myList1));
	}

	// El valor nulo no es parte de una list
	@Test
	public void testSublistNull() {
		assertFalse(myList1.sublist(null));
	}

	// Prueba que para que una lista este sea una sublista de otra TODOS los
	// elementos deben pertenercer a ella
	@Test
	public void testSublistIncomplete() {
		myList2.add("a");
		myList2.add("b");
		myList2.add("k");
		assertFalse(myList1.sublist(myList2));
	}

	// Prueba que una lista es sublista de si misma
	@Test
	public void testSublistSelf() {

		assertTrue(myList1.sublist(myList1));
	}

}
