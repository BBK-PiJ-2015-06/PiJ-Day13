/**
  * A Book is defined by its title and author. Once initialised these two piece of 
  * information cannot by subsequently modified afterwards.
  */
public interface Book {
	
	/**
	 * Retrieves the title of this Book.
	 *
	 * @return the title of this Book as a String.
	 */
	String getTitle();
	
	/**
	 * Retrieves the author of this Book.
	 *
	 * @return the author of this Book as a String. 
	 */
	String getAuthor();
	
	/**
	 * Returns true if the Book has been borrowed and false otherwise.
	 *
	 * @return true if the Book has been taken, false otherwise
	 */
	boolean isTaken();
	
	/**
	 * Sets the taken status of this Book.
	 *
	 * @param taken true or false
	 */
	void setTaken(boolean taken);
	
}