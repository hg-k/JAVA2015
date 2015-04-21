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
			CUser user = new CUser();								//DAO���� �����͸� �������� �κ�
			this.getDao().connect("member.txt");
			user =(CUser)this.getDao().read(user, vLogin.getUserID());
			this.getDao().disconnect();
			
			
			//result ������ �ʿ�!!!!!!!!!!!!!!!!!
			if(user==null){ 		//���̵� ��ã���� ��
				vUser.seteLoginResult(ELoginResult.idError);
				return vUser;
			}
			if(!user.getPassword().equals(vLogin.getPassword())){
				vUser.seteLoginResult(ELoginResult.passwordError);
				return vUser;
			}
			vUser.seteLoginResult(ELoginResult.success);
			//result ������ �ʿ�!!!!!!!!!!!!!!!!!!
			vUser.setName(user.getName());							//DAO���� �����ϴ� �κ�
			vUser.setUserID(user.getId());
			return vUser;
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			vUser.seteLoginResult(ELoginResult.fileNotFound);
			return vUser;
			}
	}	
}
