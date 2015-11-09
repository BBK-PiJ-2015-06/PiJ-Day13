public class UserImpl implements User {
	
	private String name;
	private int libraryID;
	private String libraryName;
	
	public UserImpl(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getLibraryId() {
		return this.libraryID;
	}
	
	public void register(Library library) {
		this.libraryName = library.getName();
		this.libraryID = library.getId();
	}
	
	public String getLibrary() {
		return this.libraryName;
	}
	
}