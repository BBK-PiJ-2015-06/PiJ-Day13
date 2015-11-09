import org.junit.*;
import static org.junit.Assert.*;

public class TestLibrary {
	
	private Library lib;
	
	@Before
	public void init() {
		this.lib = new LibraryImpl("Birkbeck");
	}
	
	@Test
	public void testsGetName() {
		assertEquals("Birkbeck", lib.getName());
	}
	
	@Test
	public void testsNullLibrary() {
		Library nullLib = new LibraryImpl(null);
		assertEquals(null, nullLib.getName());
		nullLib.setMaxBooksPerUser(5);
		assertEquals(0, nullLib.getMaxBooksPerUser());
	}
	
	@Test
	public void testsMaxBooksPerUser() {
		assertEquals(0, lib.getMaxBooksPerUser());
		lib.setMaxBooksPerUser(5);
		assertEquals(5, lib.getMaxBooksPerUser());
	}
	
	
}