package main;

import DAOs.IDAO;
import DAOs.MySQL;

public class CMain {

	public static void main(String[] args) {
	try {
			IDAO dao = new MySQL();
			dao.createAccount();					//하나씩 돌려가며 확인
			dao.createDB();
			dao.createTable();
			dao.insertData();
			dao.updateData();
			dao.selectData();
			dao.deleteData();
			dao.droptable();
			dao.dropDB();
			dao.dropAccount();
			
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
//			CLoginView loginView = new CLoginView();
//			CLoginControl  loginControl = new CLoginControl();
//			// association
//			loginView.setControl(loginControl);
//			loginControl.setDao(dao);
//			// start
//			VUser vUser = loginView.login();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
	}
}