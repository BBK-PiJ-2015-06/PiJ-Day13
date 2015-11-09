/**
  * A User uses a library and is defined by their name and library ID. 
  * The name of the User is defined at construction time, but the 
  * library ID is not. 
  *
  * Both the name and library ID of the user must be unique in a library.
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
}