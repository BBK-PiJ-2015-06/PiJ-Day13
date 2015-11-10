public class BookImpl implements Book {
	
	private String title;
	private String author;
	private boolean isBorrowed;
	
	public BookImpl(String title, String author) {
		this.title = title;
		this.author = author;
		this.isBorrowed = false;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public String getAuthor() {
		return this.author;
	}
	
	public boolean isTaken() {
		if(this.isBorrowed) {
			return true;
		} else {
			return false;
		}
	}
	
	public void setTaken(boolean taken) {
		this.isBorrowed = taken;
	}
	
} 