/**
  * A book is defined by its title and author. Once initialised these two piece of 
  * information cannot by subsequently modified afterwards.
  */
public interface Book {
	
	/**
	 * Retrieves the title of this book.
	 *
	 * @return the title of this book as a String.
	 */
	String getTitle();
	
	/**
	 * Retrieves the author of this book.
	 *
	 * @return the author of this book as a String. 
	 */
	String getAuthor();
	
}