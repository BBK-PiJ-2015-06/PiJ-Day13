import org.junit.*;
import static org.junit.Assert.*;

public class TestBook {
	
	private Book newBook;
	
	@Before
	public void setUp() {
		this.newBook = new BookImpl("Title", "Author");
	}
	
	@Test
	public void testsRetrievalOfBookTitle() {
		assertEquals("Title", newBook.getTitle());
	}
	
	@Test
	public void testsRetrievalOfBookAuthor() {
		assertEquals("Author", newBook.getAuthor());
	}
	
}
