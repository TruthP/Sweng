package screenManager;

public class LoginPanel extends ScreenManager{
	
	private String user_name;
	private String user_password;
	private int database_id;
	
	public void login() {
		
	}

	public String getUser_name() {
		return user_name;
	}

	public String getUser_password() {
		return user_password;
	}

	public int getDatabase_id() {
		return database_id;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}

	public void setDatabase_id(int database_id) {
		this.database_id = database_id;
	}
}
