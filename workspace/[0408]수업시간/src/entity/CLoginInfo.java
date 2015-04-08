package entity;

import java.util.Scanner;

// Entity class or Value class
public class CLoginInfo extends CEntity {
	
	private static final long serialVersionUID = 1L;
	// attributes
	public enum ELoginResult{success, idError, passwordError, error};
	ELoginResult eLoginResult;
	
	private String userID, password;
	
	
	
	public ELoginResult geteLoginResult() {return eLoginResult;}
	public void seteLoginResult(ELoginResult eLoginResult){this.eLoginResult = eLoginResult;}
	
	public CLoginInfo() {}
	
	public CLoginInfo(String userID, String password) {
		this.userID = userID;
		this.password = password;
	}
	
	public String getUserID() {return userID;}
	public void setUserID(String userID) {this.userID = userID;}
	public String getPassword() {return password;}
	public void setPassword(String password) {this.password = password;}
	
	public void print() {
		System.out.println("»ç¿ëÀÚ ID: "+userID);
		System.out.println("Password: "+password);
	}
	@Override
	public void read(Scanner scanner) {
		
	}
	@Override
	public void write() {
		
	}
}
