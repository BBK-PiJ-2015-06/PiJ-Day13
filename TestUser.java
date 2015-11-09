import org.junit.*;
import static org.junit.Assert.*;

public class TestUser {
	
	private User newUser;
	private Library lib;
	
	@Before
	public void setUp() {
		newUser = new UserImpl("Name");
		lib = new LibraryImpl("Birkbeck");
	}
	
	@Test
	public void testsRetrievalOfUserName() {
		assertEquals("Name", newUser.getName());
	}
	
	@Test
	public void testsRetrievalOfUserLibraryId() {
		assertEquals(0, newUser.getLibraryId());
	}
	
	@Test 
	public void testsRegistration() {
		assertEquals(null, newUser.getLibrary());
		newUser.register(lib);
		assertEquals("Birkbeck", newUser.getLibrary());
		assertEquals(0, newUser.getLibraryId());
	}

}