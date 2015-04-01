package Entity;

import java.io.Serializable;

public class CMember implements Serializable{

	private static final long serialVersionUID = 1L;
	private String userID, password;
	
	
	public String getUserID(){return userID;}
	public void setUserID(String userID) {this.userID = userID;}
	public String getPassword() {return password;}
	public void setPassword(String password) {this.password = password;}
	
	
	public CMember(String tok1, String tok2) { 	 					//¸â¹öID, passwordºÎ¿©
		userID = tok1;
		password = tok2;
	}
	
}
