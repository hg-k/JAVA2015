package Control;

import Entity.CSugang;

public class CSugangControl {

	public CSugang processSugang(CSugang sugang) {
		
		sugang.setGangjwaID("0330");
		sugang.setUserID("9224");
		
		return sugang;
	}

	public void result(CSugang sugang) {
		System.out.println("���� "+sugang.getUserID()+"�� �������� ���´�" + sugang.getGangjwaID()+"�Դϴ�.");
		
	}

}
