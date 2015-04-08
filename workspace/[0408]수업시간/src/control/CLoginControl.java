package control;

import entity.CLoginInfo;
import entity.CLoginInfo.ELoginResult;

public class CLoginControl extends CControl{
	
	public CLoginInfo login(CLoginInfo loginInfo) {
		
		CLoginInfo loginInfoDAO;
		this.getDao().connect("member.txt");
		
		

		while(..) // 끝까지읽고
			 loginInfoDAO = (CLoginInfo)this.getDao().read();
			if(loginInfoDAO.getUserID() == loginInfo.getUserID()){
				if(loginInfoDAO.getPassword() == loginInfo.getPassword())
					loginInfo.seteLoginResult(ELoginResult.success);
			}
			
		
		loginInfo = (CLoginInfo) this.getDao().read();
		this.getDao().disconnect();
		return loginInfo;
	}
}

