public class RegisterImpl implements Register {
	
	private UserNode listStart;
	
	public RegisterImpl() {
		listStart = null;
	}
	
	public int getSize() {
		if(this.listStart == null) {
			return 0;
		} else {
			int count = 1;
			UserNode temp = listStart;
			while(temp.getNext() != null) {
				count++;
				temp = temp.getNext();
			}
			return count;
		}
	}
	
	public int getIndex(String name) {
		int count = 0;
		if(this.listStart.getUser().getName().equals(name)) {
			return count;
		} else {
			UserNode temp = listStart;
			count++;
			while(this.listStart.getNext() != null) {
				temp = temp.getNext();
				if (temp.getUser().getName().equals(name)) {
					return count;
				} else {
					count++;
				}
			}
		} return count;
	}
	
	public void addUser(String name) {
		User newUser = new UserImpl(name);
		UserNode newUserNode = new UserNodeImpl(newUser);
		if(this.listStart == null) {
			listStart = newUserNode;
		} else {
			UserNode temp = listStart;
			while(temp.getNext() != null) {
				temp = temp.getNext();
			}
			temp.setNext(newUserNode);
		}
	}
	
	public boolean containsUser(String name) {
		boolean output = false;
		if(this.listStart != null) {
			if(this.listStart.getUser().getName().equals(name)) {
				output = true;
			} else {
				UserNode temp = listStart;
				while(this.listStart.getNext() != null) {
					temp = temp.getNext();
					if (temp.getUser().getName().equals(name)) {
						output = true;
					}
				}
			}
		}
		return output;
	}
}