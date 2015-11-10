public class LibraryImpl implements Library {
	
	private String name;
	private int maxBooksBorrowed;
	private Register libraryRegister;
	private Book[] collection;
	
	public LibraryImpl(String name) {
		this.name = name;
		this.libraryRegister = new RegisterImpl();
		this.collection = new Book[0];
	}
	
	public String getName() {
		return this.name;
	}

	public int getId(String userName) {
		if(this.libraryRegister.containsUser(userName)) {
			return this.libraryRegister.getIndex(userName);
		} else {
			this.libraryRegister.addUser(userName);
			return this.libraryRegister.getIndex(userName);
		}
	}

	public int getMaxBooksPerUser() {
		return this.maxBooksBorrowed;
	}
	
	public void setMaxBooksPerUser(int max) {
		if(this.name != null) {
			this.maxBooksBorrowed = max;
		}
	}
	
	public void addBook(String title, String author) {
		Book[] temp = new Book[this.collection.length + 1];
		Book newBook = new BookImpl(title, author);
		for(int i = 0; i < this.collection.length; i++) {
			temp[i] = this.collection[i];
		} 
		temp[temp.length - 1] = newBook;
		this.collection = temp;
	}
	
	public Book takeBook(String title) {
		if(isInCollection(title)) {
			int index = this.getIndex(title);
			if(!this.collection[index].isTaken()) {
				this.collection[index].setTaken(true);
				return this.collection[index];
			} else {
				return null;
			}
		} else {
			return null;
		}
	}
	
	public void returnBook(Book book) {
		book.setTaken(false);
	}
	
	private boolean isInCollection(String title) {
		boolean output = false;
		for(int index = 0; index < this.collection.length; index++) {
			if(this.collection[index].getTitle().equals(title)) {
				output = true;
			}
		}
		return output;
	}
	
	private int getIndex(String title) {
		if(isInCollection(title)) {
			int output = 0;
			for(int index = 0; index < this.collection.length; index++) {
				if(this.collection[index].getTitle().equals(title)) {
					output = index;
				}
			}
			return output;
		} else {
			return -1;
		}
	}
	
	public int getReaderCount() {
		return this.libraryRegister.getSize();
	}
	
	public int getBookCount() {
		return this.collection.length;
	}

	public int getBooksBorrowedCount() {
		int count = 0;
		for(int index = 0; index < this.collection.length; index++) {
			if(this.collection[index].isTaken()) {
				count++;
			}
		}
		return count;
	}
}