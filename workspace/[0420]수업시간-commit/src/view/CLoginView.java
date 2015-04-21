package view;

import java.util.Scanner;

import control.CLoginControl;
import entity.VLogin;
import entity.VUser;

public class CLoginView extends CView {

	public void login() {
		Scanner scanner = new Scanner(System.in);
		VLogin vLogin = new VLogin();
		VUser vUser = new VUser();
		
		//String userID = scanner.next();
		//String password = scanner.next();
		vLogin.setUserID("id5");
		vLogin.setPassword("pw5");
		scanner.close();
		
		vUser =((CLoginControl)this.getControl()).login(vLogin);
		System.out.println("login result:"+vUser.geteLoginResult().toString());
		
		scanner.close();
	}

}
