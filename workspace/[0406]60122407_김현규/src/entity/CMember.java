package entity;

import java.util.Scanner;

// Entity class or Value class
public class CMember extends CEntity {
	// attributes
	private String userID, password;
	
	
	public CMember() {}
	public CMember(String userID, String password) {
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
		int check = 0;
		while(scanner.hasNext()) {
			if(this.userID.equals(scanner.next())) {
				if(this.password.equals(scanner.next())) {
					System.out.println("log in");
					check = 1;
				}
			}
				
		}
		if(check == 0) {
			System.out.println("log in fail");
		}
	}
	@Override
	public void write() {
		
	}
}
