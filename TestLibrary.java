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
	
	@Test
	public void testsGetId() {
		assertEquals(0, lib.getId("Anne"));
		assertEquals(1, lib.getId("Brian"));
		assertEquals(0, lib.getId("Anne"));
		assertEquals(2, lib.getId("Claire"));
		assertEquals(3, lib.getId("David"));
		assertEquals(1, lib.getId("Brian"));
	}
	
	@Test
	public void testsAddBookTakeBookAndReturnBook() {
		lib.addBook("Programming in Java", "Horstmann");
		Book book1 = lib.takeBook("Programming in Java");
		assertEquals("Programming in Java", book1.getTitle());
		assertEquals("Horstmann", book1.getAuthor());
		assertTrue(book1.isTaken());
		lib.returnBook(book1);
		assertFalse(book1.isTaken());
	}
	
	@Test
	public void testsReaderCount() {
		assertEquals(0, lib.getReaderCount());
		User newUser = new UserImpl("Me");
		newUser.register(lib);
		assertEquals(1, lib.getReaderCount());
	}
	
	@Test
	public void testsBookAndBorrowedBookCount() {
		assertEquals(0, lib.getBookCount());
		lib.addBook("Book1", "Author1");
		assertEquals(1, lib.getBookCount());
		lib.addBook("Book2", "Author2");
		assertEquals(2, lib.getBookCount());
		assertEquals(0, lib.getBooksBorrowedCount());
		lib.takeBook("Book3");
		assertEquals(0, lib.getBooksBorrowedCount());
		lib.takeBook("Book1");
		assertEquals(1, lib.getBooksBorrowedCount());
	}
	
}