package ex02_constructor;

public class User {

	private int userNo;
	private String id;
	private String eamail;
	
	
	public User(int userNo, String id, String eamail) {
		super();
		this.userNo = userNo;
		this.id = id;
		this.eamail = eamail;
	}
	
	@Override
	public String toString() {
		return "User [userNo=" + userNo + ", id=" + id + ", eamail=" + eamail + "]";
	}
	
	
}
