/**
  * A Register provides a dynamic data structure, comprised of a singly 
  * linked list that keeps a record of all names of library users that
  * have registered with the library.
  *
  * These registered Users are ordered in terms of their index, which also
  * provides a method for determining unique library ID for each individual.
  */
public interface Register {
	
	/**
	 * Retrieves the number of registered Users in the list.
	 *
	 * @return the size of this Register.
	 */
	int getSize();
	
	/**
	 * Retrieves the index (library ID) of a User whose name exactly matches
	 * the input provided.
	 *
	 * @param name the name of the User whose index (library ID) is to be found
	 *        and returned
	 * @return the index (library ID) of this User
	 */
	int getIndex(String name);
	
	/**
	 * Adds a new registered User to the list.
	 *
	 * @param name the name of the new User to be added to the Register.
	 */
	void addUser(String name);
	
	/**
	 * Returns true if the name of the User is found within the list, false
	 * otherwise.
	 *
	 * @param name the name of the User to be searched for in the list.
	 * @return returns true if the name is found in the list, false otherwise
	 */
	boolean containsUser(String name);
}