public class LibraryImpl implements Library {
	
	private String name;
	private int maxBooksBorrowed;
	private Register libraryRegister;
	
	public LibraryImpl(String name) {
		this.name = name;
		this.libraryRegister = new RegisterImpl();
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
	
}