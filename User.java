/**
  * A User uses a library and is defined by their name and library ID. 
  * The name of the User is defined at construction time, but the 
  * library ID is not. 
  *
  * Both the name and library ID of the user must be unique in a library.
  *
  * A User is also able to borrow Books from a Library's collection once a 
  * User has registered with the Library. 
  */
public interface User {
	
	/**
	 * Retrieves the name of this User.
	 *
	 * @return the name of this User as a String.
	 */
	String getName();
	
	/**
	 * Retrieves the library ID of this User.
	 * 
	 * @return the library ID of this User as an integer.
	 */
	int getLibraryId();
	
	/**
	 * Enables a user to register with a library and receive a 
	 * library ID specific to this library.
	 *
	 * @param libraryName the name of the library that the User is to register with
	 */
	void register(Library library);
	
	/**
	 * Retrieves the library that this User is a member of.
	 *
	 * @return the name of the library that this User is a member of
	 */
	String getLibrary();
	
	/**
	 * Enables the User to borrow a Book from the Library's collection that
	 * the user is registered with.
	 *
	 * If the User is not registered with a Library, this method performs no 
	 * functionality. If the title of the Book is not found within the Library
	 * collection, the method performs no functionality.
	 *
	 * @param title the title of the Book that the User will borrow
	 */
	void borrowBook(String title);
	
	/**
	 * Enables the User to return a Book to the Library's collection that
	 * the user is registered with.
	 *
	 * If the User is not registered with a Library, this method performs no 
	 * functionality. If the title of the Book is not found within the User's
	 * collection, the method performs no functionality.
	 *
	 * @param title the title of the Book that the User will return
	 */
	void returnBook(String title);
	
	/**
	 * Returns a list of the Books that this User is currently borrowing.
	 *
	 * @return an array list of Books that the User is currently borrowing
	 */
	Book[] getBorrowedBooks();
}