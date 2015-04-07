package view;

import java.util.Scanner;

import entity.CMember;

public class CLoginView extends CView {

	public CMember login() {
		Scanner scanner = new Scanner(System.in);
		CMember member = new CMember();
		
		//String userID = scanner.next();
		member.setUserID("userID");
		//String password = scanner.next();
		member.setPassword("password");
		scanner.close();
		
		return member = (CMember)this.getControl().process(member);
	}

}
