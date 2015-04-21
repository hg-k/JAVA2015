package control;

import java.io.FileNotFoundException;

import entity.CUser;
import entity.VLogin;
import entity.VUser;
import entity.VUser.ELoginResult;

public class CLoginControl extends CControl{
	
	public VUser login(VLogin vLogin){
		VUser vUser = new VUser();
						
		try {
			CUser user = new CUser();								//DAO에서 데이터를 가져오는 부분
			this.getDao().connect("member.txt");
			user =(CUser)this.getDao().read(user, vLogin.getUserID());
			this.getDao().disconnect();
			
			
			//result 정리가 필요!!!!!!!!!!!!!!!!!
			if(user==null){ 		//아이디를 못찾았을 때
				vUser.seteLoginResult(ELoginResult.idError);
				return vUser;
			}
			if(!user.getPassword().equals(vLogin.getPassword())){
				vUser.seteLoginResult(ELoginResult.passwordError);
				return vUser;
			}
			vUser.seteLoginResult(ELoginResult.success);
			//result 정리가 필요!!!!!!!!!!!!!!!!!!
			vUser.setName(user.getName());							//DAO에서 가공하는 부분
			vUser.setUserID(user.getId());
			return vUser;
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			vUser.seteLoginResult(ELoginResult.fileNotFound);
			return vUser;
			}
	}	
}
