import org.junit.*;
import static org.junit.Assert.*;

public class TestUser {
	
	private User newUser;
	private LibraryMock lib;
	
	@Before
	public void setUp() {
		newUser = new UserImpl("Name");
		lib = new LibraryMock();
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
		assertEquals(01, newUser.getLibraryId);
	}
	
	@Test
	public void testsRetrievalOfLibraryNameAfterRegistration() {
		newUser.register(lib);
		assertEquals("Library", newUser.getLibrary());
	}
	
}