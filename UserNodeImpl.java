public class UserNodeImpl implements UserNode {
	
	private User user;
	private UserNode next;
	
	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	public UserNode getNext() {
		return this.next;
	}
	
	public void setNext(UserNode nextUserNode) {
		this.next = nextUserNode;
	}
	
}