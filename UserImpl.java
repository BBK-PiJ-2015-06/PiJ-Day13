public class UserImpl implements User {
	
	private String name;
	private int libraryID;
	private String libraryName;
	private Book[] borrowedBookList;
	private Library lib;
	
	public UserImpl(String name) {
		this.name = name;
		this.borrowedBookList = null;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getLibraryId() {
		return this.libraryID;
	}
	
	public void register(Library library) {
		this.libraryName = library.getName();
		this.lib = library;
		this.libraryID = library.getId(this.name);
		this.borrowedBookList = new Book[0];
	}
	
	public String getLibrary() {
		return this.libraryName;
	}
	
	public void borrowBook(String title) {
		if(this.borrowedBookList != null) {
			Book[] temp = new Book[this.borrowedBookList.length + 1];
			for(int index = 0; index < this.borrowedBookList.length; index++) {
				temp[index] = this.borrowedBookList[index];
			}
			temp[temp.length - 1] = this.lib.takeBook(title);
			borrowedBookList = temp;
		}
	}

	public void returnBook(String title) {
		int index = -1;
		for(int i = 0; i < this.borrowedBookList.length; i++) {
			if(this.borrowedBookList[i].getTitle().equals(title)) {
				index = i;
			}
		}
		if(index >= 0) {
			this.lib.returnBook(this.borrowedBookList[index]);
			Book[] temp = new Book[this.borrowedBookList.length - 1];
			for(int i = 0; i < temp.length; i++) {
				if(i != index) {
					temp[i] = this.borrowedBookList[i];
				}
			}
			borrowedBookList = temp;
		}
	}

	public Book[] getBorrowedBooks() {
		return this.borrowedBookList;
	}
}