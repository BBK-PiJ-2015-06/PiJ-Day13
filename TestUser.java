import org.junit.*;
import static org.junit.Assert.*;

public class TestUser {
	
	private User newUser;
	
	@Before
	public void setUp() {
		newUser = new UserImpl("Name");
	}
	
	@Test
	public void testsRetrievalOfUserName() {
		assertEquals("Name", newUser.getName());
	}
	
	@Test
	public void testsRetrievalOfUserLibraryId() {
		assertEquals(0, newUser.getLibraryId());
	}
	
}