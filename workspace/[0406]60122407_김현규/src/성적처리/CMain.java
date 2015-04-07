package 성적처리;

import view.CLoginView;
import DAOs.IDAO;
import DAOs.TextDAO;
import control.CLoginControl;

public class CMain {

	public static void main(String[] args) {
		// create objects
		CLoginView loginView = new CLoginView();
		CLoginControl loginControl = new CLoginControl();
		IDAO memberDAO = new TextDAO();						//text파일로부터 읽은 상태
		
		// associates
		loginView.setControl(loginControl);					//loginView-loginControl-IDAO 연결
		loginControl.setDao(memberDAO);
		
		// start login
		loginView.login();									//로그인화면호출
			
	}

}