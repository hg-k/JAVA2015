package main;

import view.CLoginView;
import DAOs.IDAO;
import DAOs.TextDAO;
import control.CLoginControl;

public class CMain {

	public static void main(String[] args) {
		// create objects
		CLoginView loginView = new CLoginView();
		CLoginControl loginControl = new CLoginControl();
		IDAO memberDAO = new TextDAO();
		
		// associates
		loginView.setControl(loginControl);
		loginControl.setDao(memberDAO);
		
		// start login
		loginView.login();
	}

}
