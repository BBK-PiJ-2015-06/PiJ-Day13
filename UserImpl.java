public class UserImpl implements User {
	
	private String name;
	private int libraryID;
	
	public UserImpl(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getLibraryId() {
		return this.libraryID;
	}
	
}