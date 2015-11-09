import org.junit.*;
import static org.junit.Assert.*;

public class TestUser {
	
	private User newUser;
	private Library lib;
	
	@Before
	public void setUp() {
		newUser = new UserImpl("Name");
		lib = new Library();
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
	public void testsRetrievalOfLibraryName() {
		assertEquals(null, newUser.getLibrary());
	}
	
	@Test
	public void testsRetrievalOfUserLibraryIdAfterRegistration() {
		newUser.register(lib);
		assertEquals(1, newUser.getLibraryId());
	}
	
	@Test
	public void testsRetrievalOfLibraryNameAfterRegistration() {
		newUser.register(lib);
		assertEquals("Library", newUser.getLibrary());
	}
	
}