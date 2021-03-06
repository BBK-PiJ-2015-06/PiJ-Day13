public class UserNodeImpl implements UserNode {
	
	private User user;
	private UserNode next;
	
	public UserNodeImpl(User user) {
		this.user = user;
		this.next = null;
	}
	
	public User getUser() {
		return this.user;
	}
	
	public UserNode getNext() {
		return this.next;
	}
	
	public void setNext(UserNode nextUserNode) {
		this.next = nextUserNode;
	}
	
}