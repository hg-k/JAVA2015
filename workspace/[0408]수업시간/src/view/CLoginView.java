package view;

import java.util.Scanner;

import control.CLoginControl;
import entity.CLoginInfo;

public class CLoginView extends CView {

	public CLoginInfo login() {
		Scanner scanner = new Scanner(System.in);
		CLoginInfo member = new CLoginInfo();
		
		//String userID = scanner.next();
		member.setUserID("userID");
		//String password = scanner.next();
		member.setPassword("password");
		scanner.close();
		
		return member = (CLoginInfo)((CLoginControl)this.getControl()).login(member);
	}

}
