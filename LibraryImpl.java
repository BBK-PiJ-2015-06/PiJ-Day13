public class LibraryImpl implements Library {
	
	private String name;
	private int maxBooksBorrowed;
	
	public LibraryImpl(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}

	public int getId() {
		return 0;
	}

	public int getMaxBooksPerUser() {
		return this.maxBooksBorrowed;
	}
	

	public void setMaxBooksPerUser(int max) {
		if(this.name != null) {
			this.maxBooksBorrowed = max;
		}
	}
	
}