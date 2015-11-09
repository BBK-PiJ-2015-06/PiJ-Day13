/**
  * A UserNode contains a User and a pointer that points 
  * to another User in the list. This UserNode is created as a 
  * means for storing information about registered library Users
  * as a dynamically linked list.
  */

public interface UserNode {
	
	/**
	 * Retrieves the User from this UserNode.
	 *
	 * @return the User of this UserNode.
	 */
	User getUser();
	
	/**
	 * Retrieves the next UserNode
	 *
	 * @return the next UserNode
	 */
	UserNode getNext();
	
	/**
	 * Sets this next UserNode.
	 *
	 * @param nextUserNode the UserNode that this next is to
     *        be set to
	 */
	void setNext(UserNode nextUserNode);
	
}