/**
 * A library is used by Users to borrow Books. 
 *
 * A library is defined by its name, which is introduced at construction,
 * the maximum number of books that can be borrowed per user, and the
 * number of users that have registered with the library.
 *
 * This last attribute enables unique library ID numbers to be presented 
 * to new users. 
 */

public interface Library {
	
	/**
	 * Retrieves the name of this Library.
	 *
	 * @return the name of this Library.
	 */
	String getName();
	
	/**
	 * Retrieves the number of the current library ID that is yet to be
     * issued to a new registered User.
	 *
	 * @return the current library ID that has not yet been issued to a 
	 *         registered User.
	 */
	int getId();
	
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
	 * @param max the maximum number of books that each User is allowed to borrow
	 */
	void setMaxBooksPerUser(int max);
}