package view;

import java.util.Scanner;

import entity.CMember;

public class CLoginView extends CView {

	public CMember login() {
		Scanner scanner = new Scanner(System.in);
		CMember member = new CMember();
		
		
		
		System.out.print("아이디를 입력하세요: ");
		String userID = scanner.next();
		member.setUserID(userID);
		System.out.println("");
		
		System.out.print("패스워드를 입력하세요: ");
		String password = scanner.next();
		member.setPassword(password);
		System.out.println("");
		scanner.close();
		
		return member = (CMember) getControl().process(member);
	}

}
