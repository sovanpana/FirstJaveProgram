package OOP_Encapsulation;

public class Login {
	
	private String username;
	private String pwd;
	
		public Login(String username, String pwd) {		
		this.username = username;
		this.pwd = pwd;
		}

		
		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getPwd() {
			return pwd;
		}

		public void setPwd(String pwd) {
			this.pwd = pwd;
		}
	
	
	

}
