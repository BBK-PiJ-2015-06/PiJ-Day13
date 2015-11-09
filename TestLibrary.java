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
	
}