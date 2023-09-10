package TypeOfUser;

public abstract class User {
	String userID = "";
	String Password = "";
	String LoginStatus = "";

	abstract Boolean verifyUser();

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getLoginStatus() {
		return LoginStatus;
	}

	public void setLoginStatus(String loginStatus) {
		LoginStatus = loginStatus;
	}
}
