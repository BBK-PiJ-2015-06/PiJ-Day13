/**
 * A library is used by Users to borrow Books. 
 *
 * A library is defined by its name, which is introduced at construction,
 * the maximum number of books that can be borrowed per user, and the
 * number of users that have registered with the library.
 *
 * This last attribute enables unique library ID numbers to be presented 
 * to new users. 
 *
 * A Library that has been constructed with a null name is not able to issue 
 * ID numbers to Users or enable books to be borrowed.
 */

public interface Library {
	
	/**
	 * Retrieves the name of this Library.
	 *
	 * @return the name of this Library.
	 */
	String getName();
	
	/**
	 * Retrieves the ID number of the User, if they exist as a registered
	 * User with the library.
	 *
	 * If the name of the User is not recognisable, this method retrieves 
	 * the number of the current library ID that is yet to be issued and 
	 * issues this ID number to the new registered User.
	 *
	 *@param userName the name of existing or new library User
	 * @return the library ID of the User, or if the User has not yet been 
	           registered, a new unique library ID
	 */
	int getId(String userName);
	
	/**
	 * Retrieves the maximum number of books that this Library allows
	 * individual Users to borrow.
	 *
	 * @return the maximum number of books that each User is allowed to borrow
	 */
	int getMaxBooksPerUser();
	
	/**
	 * Sets the maximum number of books that this Library allows
	 * individual Users to borrow.
	 *
	 * This method does nothing if performed upon a Library with a null name.
	 *
	 * @param max the maximum number of books that each User is allowed to borrow
	 */
	void setMaxBooksPerUser(int max);

}